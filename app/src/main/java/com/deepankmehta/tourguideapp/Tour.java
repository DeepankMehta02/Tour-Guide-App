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

public class Tour {

    /**
     * Variables
     */
    private int mImageResourceId;
    private String mName;
    private String mDetails;

    /**
     * Constructor
     * @param imageResourceId
     * @param name
     * @param details
     */
    public Tour(int imageResourceId, String name, String details) {
        mImageResourceId = imageResourceId;
        mName = name;
        mDetails = details;
    }

    /**
     * Getter methods for all the member variables
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getDetails() {
        return mDetails;
    }
}
