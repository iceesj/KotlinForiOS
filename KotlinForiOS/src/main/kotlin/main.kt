//
//  main.kt
//  KotlinForiOS
//
//  Created by tom on 2018/5/17.
//  Copyright © 2018 iceesj. All rights reserved.
//

import kotlinx.cinterop.*
import platform.Foundation.*
import platform.UIKit.*

fun main(args: Array<String>) {
    memScoped {
        val argc = args.size + 1
        val argv = (arrayOf("konan") + args).map { it.cstr.getPointer(memScope) }.toCValues()

        autoreleasepool {
            UIApplicationMain(argc, argv, null, NSStringFromClass(AppDelegate))
        }
    }
}
