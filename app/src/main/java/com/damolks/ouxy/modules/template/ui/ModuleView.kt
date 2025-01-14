package com.damolks.ouxy.modules.template.ui

import android.content.Context
import android.widget.LinearLayout
import androidx.lifecycle.LifecycleOwner

class ModuleView(context: Context) : LinearLayout(context) {
    init {
        orientation = VERTICAL
        setupView()
    }
    
    private fun setupView() {
        // Configuration de la vue
    }
}