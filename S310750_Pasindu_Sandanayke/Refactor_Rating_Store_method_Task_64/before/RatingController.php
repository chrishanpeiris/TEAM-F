 public function store(Request $request)
    {

        $name = $request['username'];
        $filename = '';
        $verify = 0;
        if ($request->hasFile('image')) {
            $file = $request->file('image');
            $extension = $file->getClientOriginalExtension(); // getting image extension
            $filename = $name . '_' . +time() . '.' . $extension;
            $destination = public_path('img/uploads/market');
            $file->move($destination, $filename);
        } else {
            $filename = 'user_default.jpg';
        }
        if ($request['verify'] == "on") {
            $verify = 1;
        } elseif ($request['verify'] == null) {
            $verify = 0;
        }

        Rating::create([
            'market_id' => $request['market_id'],
            'username' => $request['username'],
            'email' => $request['email'],
            'rating' => (integer)$request['rating'],
            'image' => '/img/uploads/market/' . (string)$filename,
            'verify' => $verify,
            'comment' => $request['comment'],

        ]);

        $rating_avg = self::getRatingNumber($request['market_id']);
        $verify_count = self::getMarketVerifyStatus($request['market_id']);

        DB::table('markets')
            ->where('id', '=', $request['market_id'])
            ->update(['avg_rating' => $rating_avg, 'verify_count' => $verify_count]);

        return redirect()->route('shop.show', $request['market_id'])->with('status', 'Thank you for your feedback');
    }
