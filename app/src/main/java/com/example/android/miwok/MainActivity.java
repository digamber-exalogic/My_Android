/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView myNumbers, myFamily, myColors, myPhrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        myNumbers = findViewById(R.id.numbers);
        myFamily = findViewById(R.id.family);
        myPhrases = findViewById(R.id.phrases);
        myColors = findViewById(R.id.colors);

        myNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);

                Toast.makeText(getApplicationContext(), "Welcome To Numbers!",Toast.LENGTH_SHORT).show();
            }
        });

        myFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent numbersIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(numbersIntent);

                Toast.makeText(getApplicationContext(), "Welcome To Family!",Toast.LENGTH_SHORT).show();
            }
        });

        myColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent numbersIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(numbersIntent);

                Toast.makeText(getApplicationContext(), "Welcome To Colors!",Toast.LENGTH_SHORT).show();
            }
        });

        myPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent numbersIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(numbersIntent);

                Toast.makeText(getApplicationContext(), "Welcome To Phrases!",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
