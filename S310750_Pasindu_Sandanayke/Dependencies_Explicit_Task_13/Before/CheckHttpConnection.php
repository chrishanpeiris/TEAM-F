// Check validates http connectivity type, direct or via proxy.
func Check() (warnings, errors []error) {
    glog.V(1).Infof("validating if the connectivity type is via proxy or direct")
    u := (&url.URL{Scheme: hst.Proto, Host: hst.Host}).String()

    req, err := http.NewRequest("GET", u, nil)
    if err != nil {
        return nil, []error{err}
    }

    proxy, err := netutil.SetOldTransportDefaults(&http.Transport{}).Proxy(req)
    if err != nil {
        return nil, []error{err}
    }
    if proxy != nil {
        return []error{fmt.Errorf("Connection to %q uses proxy %q. If that is not intended, adjust your proxy settings", u, proxy)}, nil
    }
    return nil, nil
}