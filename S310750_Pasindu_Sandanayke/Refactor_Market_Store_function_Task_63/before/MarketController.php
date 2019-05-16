  public function store(Request $request)
    {
        //request validation rules
        $validator = Validator::make($request->all(), [
            'name' => 'required|string|max:255',
            'email' => 'required|string|email|max:255|unique:users',
            'type' => 'required',
            'street_address' => 'required',
            'phone_num' => 'string|max:13',
            'suburb' => 'required',
            'postcode' => 'required',
            'city' => 'required',
            'country' => 'required',

        ]);
        if ($validator->fails()) {
            return redirect('shop/create')
                ->withErrors($validator)
                ->withInput();
        }


        //image uploading
        $type = $request['type'];
        $filename = '';

        if ($request->hasFile('image')) {
            $file = $request->file('image');
            $extension = $file->getClientOriginalExtension(); // getting image extension
            $filename = $type . '_' . +time() . '.' . $extension;
            $destination = public_path('img/uploads/market');
            $file->move($destination, $filename);
        } else {
            $filename = 'default.jpg';
        }

        $monday = $request['mondayFrom'] . '-' . $request['mondayTo'];
        $tuesday = $request['tuesdayFrom'] . '-' . $request['tuesdayTo'];
        $wednesday = $request['wednesdayFrom'] . '-' . $request['wednesdayTo'];
        $thursday = $request['thursdayFrom'] . '-' . $request['thursdayTo'];
        $friday = $request['fridayFrom'] . '-' . $request['fridayTo'];
        $saturday = $request['saturdayFrom'] . '-' . $request['saturdayTo'];
        $sunday = $request['sundayFrom'] . '-' . $request['sundayTo'];

        if ($request->has('otherType') && ($request->input('otherType') != null)) {
            if (Type::create([
                'type' => $request['otherType'],
            ])) {
                $request['type'] = $request['otherType'];
            }


        }

        Market::create([
            'name' => $request['name'],
            'type' => $request['type'],
            'description' => $request['description'],
            'country' => $request['country'],
            'phone_num' => $request['phone_num'],
            'email' => $request['email'],
            'website' => $request['website'],
            'street_address' => $request['street_address'],
            'postcode' => $request['postcode'],
            'suburb' => $request['suburb'],
            'city' => $request['city'],
            'image' => '/img/uploads/market/' . (string)$filename,
            'fb_url' => $request['fb_url'],
            'youtube_url' => $request['youtube_url'],
            'twitter_url' => $request['twitter_url'],
            'monday' => (string)$monday,
            'tuesday' => (string)$tuesday,
            'wednesday' => (string)$wednesday,
            'thursday' => (string)$thursday,
            'friday' => (string)$friday,
            'saturday' => (string)$saturday,
            'sunday' => (string)$sunday,
            'avg_rating' => '0',
            'verify_count' => '0',

        ]);


        return redirect()->route('shop.index')->with('status', 'Market created');

    }
