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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    /**
     * Creates a new Tour adapter object
     */
    public TourAdapter(Context context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /**
         * Check if an existing view is reused, otherwise inflate the view
         */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        /**
         * Get the object located at this position in the list
         */
        Tour currentTour = getItem(position);

        /**
         * Display the image of the current tour
         */
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentTour.getImageResourceId());

        /**
         * Display the name of the current tour
         */
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text);
        nameTextView.setText(currentTour.getName());

        /**
         * Display the details of the current tour
         */
        TextView detailsTextView = (TextView) listItemView.findViewById(R.id.content_text);
        detailsTextView.setText(currentTour.getDetails());

        /**
         * Returns the list item layout
         */
        return listItemView;

    }
}
