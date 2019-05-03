type requestBuilder interface {
    NewRequest(string, string, io.Reader) (*http.Request, error)
}

type reqBuilder struct {}
func (rb *reqBuilder) NewRequest(method, url string, body io.Reader) (*http.Request, error) {
    return http.NewRequest(method, url, body)
}


func Check(rb requestBuilder) (warnings, errors []error) {

    req, err := rb.NewRequest("GET", u, nil)
    if err != nil {
        return nil, []error{err}
    }
   
}
