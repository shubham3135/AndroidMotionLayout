
package com.google.samples.motionlayoutcodelab

import android.os.Bundle
import android.util.TypedValue
import android.view.View
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.appbar.AppBarLayout

class Step8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step8)

        coordinateMotion()
    }

    private fun coordinateMotion() {
        // TODO: set progress of MotionLayout based on an AppBarLayout.OnOffsetChangedListener

    }
}
