  public function getAllSearch(Request $request)
    {
        //get correct location
        $location = $request->input('location');
        $newlocation = explode(" ", $location);
        $request['location'] = $newlocation[0];


        if ($request->has('keyword') && ($request->input('keyword') != null)) {
            if ($request->has('type') && ($request->input('type') != null)) {
                if ($request->has('location') && ($request->input('location') != null)) {
                    return $this->getAllFieldSearch($request);
                }
            }
        }

        if ($request->has('keyword') && ($request->input('keyword') != null)) {
            if ($request->has('type') && ($request->input('type') != null)) {
                return $this->getKeywordAndType($request->input('keyword'), $request->input('type'));
            }

        }
        if ($request->has('keyword') && ($request->input('keyword') != null)) {
            if ($request->has('location') && ($request->input('location') != null)) {
                return $this->getKeywordAndLocation($request->input('keyword'), $request->input('location'));
            }

        }
        if ($request->has('type') && ($request->input('type') != null)) {
            if ($request->has('location') && ($request->input('location') != null)) {
                return $this->getTypeAndLocation($request->input('type'), $request->input('location'));
            }

        }


        if ($request->has('keyword') && ($request->input('keyword') != null)) {

            return $this->getMarketByKeyword($request->input('keyword'));
        }
        if ($request->has('type') && ($request->input('type') != null)) {

            return $this->getMarketByType($request->input('type'));
        }

        if ($request->has('location') && ($request->input('location') != null)) {

            return $this->getMarketByLocation($request->input('location'));
        }


        return redirect()->route('shop.index');

    }
