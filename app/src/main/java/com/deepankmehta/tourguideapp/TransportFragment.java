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
public class TransportFragment extends Fragment {

    /**
     * Empty constructor
     */
    public TransportFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        /**
         * Creates a list of transports
         */
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.delhi_metro, "Delhi Metro", "The Delhi Metro is a rapid transit system serving Delhi and its satellite cities of Bahadurgarh, Ballabhgarh, Faridabad, Ghaziabad, Gurgaon and Noida in the National Capital Region of India."));
        tours.add(new Tour(R.drawable.dtc_bus, "DTC Bus", "Delhi Transport Corporation is the main public transport operator of Delhi. It is one of the largest CNG-powered bus service operator in the world."));

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
