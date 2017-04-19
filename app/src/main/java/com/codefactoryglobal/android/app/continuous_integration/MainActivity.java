package com.codefactoryglobal.android.app.continuous_integration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		/*
		
		http://it.droidcon.com/2017/sessions/continuous-delivery-with-ease/
		
		Requirement:

Bring your own laptop with Android Studio installed and ready to create and run new, empty project.

workshop Outline:

Do you create builds for your client frequently? Maybe every day? That’s good, because you can get feedback early and often… unless you do that manually, pushing APKs via mail or to some app testing platform via browser. How about testing? Do you start your app on device or emulator after every change and test nothing is broken? Look back at the time spent on these tedious tasks. How would you feel if you could spend less time and do even more at the same time? During the workshop we will create a simple application and look into how easy it is to set things up, so we don’t have to spend even a minute a day to create builds for your testers. There will be tests, there will be CI and, most importantly, there will be fun and glory.

The workshop aims to introduce many tools and services helping automate different parts of delivering quality app.

This is a draft of agenda introduced to participants:

0. Setup communication channel.
1. Create repo
2. Github to Slack notifications.
3. Setup ticketing system!
4. Setup CI.
5. Create empty project.
6. Moar CI setup.
7. Travis to Slack notifications.

8. Crashes to Fabric integration.
9. Fabric to Slack notifications.
10. Automate upload to Fabric beta.
11. Notify testers about new builds, with commit messages.

12. Codebeat integration.
13. Coveralls integration.
14. Coveralls to Slack notifications.
15. Some functional testing. Aim for 100% code coverage.
16. Add travis, waffle, codebeat, coveralls badges.
17. Automate upload to Google Play.
		*/
    }
}
