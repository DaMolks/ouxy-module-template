package com.damolks.ouxy.modules.template

import android.view.View
import android.widget.LinearLayout
import com.damolks.ouxy.module.ModuleContext
import com.damolks.ouxy.module.OuxyModule
import com.damolks.ouxy.modules.template.data.Storage
import com.damolks.ouxy.modules.template.ui.ModuleView

class TemplateModule : OuxyModule {
    private lateinit var context: ModuleContext
    private lateinit var storage: Storage
    private lateinit var mainView: ModuleView
    
    override fun initialize(context: ModuleContext) {
        this.context = context
        this.storage = Storage(context.storage)
        this.mainView = ModuleView(context.context)
        
        setupEventHandlers()
    }
    
    override fun getMainView(): View = mainView
    
    override fun cleanup() {
        // Nettoyage si nécessaire
    }
    
    private fun setupEventHandlers() {
        context.registerEventHandler("template_action") { data ->
            // Traitement des événements
        }
    }
}