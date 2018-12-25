/*
 * Copyright 2018 Deepank Mehta. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.deepankmehta.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * create an instance of this fragment.
 */
public class HotelFragment extends Fragment {

    /**
     * Empty constructor
     */
    public HotelFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        /**
        * Creates a list of hotels
        */
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.taj_hotel, "Taj Hotel", "Experience the pulse of India’s capital from Taj Palace, New Delhi, set on six lush acres in the prestigious Diplomatic Enclave of Delhi. In town for business or to soak in the city’s history, this luxury hotel is your ideal choice."));
        tours.add(new Tour(R.drawable.leela_hotel, "Leela Hotel", "Some journeys can be summed up in a photo, a tweet, a souvenir. But others are so filled with inner riches, they defy easy description. For our guests, this has always posed a challenge: How to best capture the world of luxury that is The Leela?"));
        tours.add(new Tour(R.drawable.hyatt_hotel, "Hyatt Hotel", "Our foundation in family goes back to 1957, when entrepreneur Jay Pritzker purchased the original Hyatt House motel. Pritzker and his brother, Donald, worked to grow the Hyatt brand, powered by their belief in the importance of family and care."));

        /**
         * Creates a tour adapter
         */
        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        /**
         * Finds the list view object
         */
        ListView listView = (ListView) rootView.findViewById(R.id.data_list);

        /**
         * Makes the list view use the tour adapter created above
         */
        listView.setAdapter(adapter);

        return rootView;
    }


}
