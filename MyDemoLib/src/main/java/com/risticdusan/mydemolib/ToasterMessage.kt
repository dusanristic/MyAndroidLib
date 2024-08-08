package com.risticdusan.mydemolib

class ToasterMessage {

    companion object {
        @JvmStatic
        fun show(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}