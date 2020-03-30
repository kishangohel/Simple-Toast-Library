package kishan.library.ktoaster

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes

object ToastMessage : Throwable() {

    override val message: String?
        get() = "call initialize() in your Application class."

    private var context: Context? = null
        get() {
            if (field == null)
                throw this
            return field
        }


    fun initialize(context: Context) {
        this.context = context
    }

    fun s(@StringRes message: Int) {
        s(context!!.resources.getString(message))
    }

    fun s(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun l(@StringRes message: Int) {
        l(context!!.resources.getString(message))
    }

    fun l(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}