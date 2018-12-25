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
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Finds the viewpager that allows the user to swipe between different fragments
         */
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        /**
         * Creates an adapter that knows which fragment to show
         */
        FragmentAdapter adapter = new FragmentAdapter(this, getSupportFragmentManager());

        /**
         * Sets the adapter on to the viewpager
         */
        viewPager.setAdapter(adapter);

        /**
         * Finds the tab layout that shows the tabs
         */
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        /**
         * Connects the tab layout with the viewpager
         */
        tabLayout.setupWithViewPager(viewPager);
    }
}
