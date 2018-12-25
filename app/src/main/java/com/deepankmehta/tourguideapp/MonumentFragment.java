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
public class MonumentFragment extends Fragment {

    /**
     * Empty constructor
     */
    public MonumentFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        /**
         * Creates a list of monuments
         */
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.india_gate, "India Gate", "The India Gate भारत द्वार is a war memorial located astride the Rajpath, on the eastern edge of the \"ceremonial axis\" of New Delhi, India, formerly called Kingsway."));
        tours.add(new Tour(R.drawable.red_fort, "Red Fort", "Red Fort is a historic fort in the city of Delhi in India. It was the main residence of the emperors of the Mughal dynasty for nearly 200 years, until 1856. It is located in the center of Delhi and houses a number of museums."));
        tours.add(new Tour(R.drawable.lotus_temple, "Lotus Temple", "The Lotus Temple, located in Delhi, India, is a Bahá'í House of Worship that was dedicated in December 1986, costing $10 million. Notable for its flowerlike shape, it has become a prominent attraction in the city."));

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
