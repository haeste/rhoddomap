package chris.thornton.rhoddomap

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

/**
 * Dialog box to confirm the plant type.
 */
class SelectTreeType : DialogFragment() {

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return activity?.let {
                // Use the Builder class for convenient dialog construction
                val builder = AlertDialog.Builder(it)
                builder.setMessage(R.string.dialog_select_tree)
                    .setPositiveButton(R.string.is_rhoddo,
                        DialogInterface.OnClickListener { dialog, id ->

                        })
                    .setNegativeButton(R.string.not_rhoddo,
                        DialogInterface.OnClickListener { dialog, id ->

                        })
                // Create the AlertDialog object and return it
                builder.create()
            } ?: throw IllegalStateException("Activity cannot be null")
        }
}
