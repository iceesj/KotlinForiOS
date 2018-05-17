//
//  AppDelegate.kt
//  KotlinForiOS
//
//  Created by tom on 2018/5/17.
//  Copyright © 2018 iceesj. All rights reserved.
//

import kotlinx.cinterop.*
import platform.UIKit.*

class AppDelegate : UIResponder(), UIApplicationDelegateProtocol {
    companion object : UIResponderMeta(), UIApplicationDelegateProtocolMeta {}

    override fun init() = initBy(AppDelegate())

    private var _window: UIWindow? = null
    override fun window() = _window
    override fun setWindow(window: UIWindow?) { _window = window }
}
