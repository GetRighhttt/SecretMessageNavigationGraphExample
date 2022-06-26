package com.example.secretmessageexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

/**
 * This app is an example on how to use Fragments to switch between multiple screens
 * in your app.
 * This is the preferred method to developing apps from Android Developers.
 * It was recently adopted when the Navigation component in Android Studio was added.
 * The WelcomeFragment class extends Fragment() similar to how in an activity, it extends
 * AppCompatActivity. Both are apart of Android Jetpack.
 */

class WelcomeFragment : Fragment() {
    /**
     * The override onCreateView method gets called whenever we open a Fragment
     * It gives Android access to the fragment's layout.
     * Layout Inflater is used to inflate the Fragment's layout.
     * The second parameter is a ViewGroup in the activity's layout that displays the fragment.
     * Bundle? is used when you want to save the Fragment's state.
     * The return statement is how the fragment is ACTUALLY inflated. It is similar to
     * setContentView() in an activity.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        /**
         *
         * Now we are going to demonstrate how to give a button functionality.
         * We set val view = to inflater.
         * We then initialize the start button and find the view by ID.
         * Then we call setOCL, reference a NAV controller and navigate() to the
         * other fragment.
         */

        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        val startButton = view.findViewById<Button>(R.id.start)

        startButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_welcomeFragment_to_messageFragment)
        }
        return view
    }
}