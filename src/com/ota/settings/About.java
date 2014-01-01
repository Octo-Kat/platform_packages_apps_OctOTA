/*=========================================================================
 *
 *  PROJECT:  OctOS
 *  LICENSE   http://www.gnu.org/licenses/gpl-2.0.html GNU/GPL
 *
 *  AUTHORS:     fronti90, mnazim, tchaari, kufikugel
 *  DESCRIPTION: OctOTA keeps our rom up to date
 *
 *=========================================================================
 */

package com.oct.ota.settings;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.oct.ota.R;

public class About extends Activity {
    private static final String TAG = "About";

    private static final int ID_HOME_URL = R.id.about_home;
    private static final int ID_CONTACT = R.id.about_contact;
    private static final int ID_LICENSE = R.id.about_license_url;

    private TextView mHomeURL;
    private TextView mContact;
    private TextView mLicense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        mHomeURL = (TextView) findViewById(ID_HOME_URL);
        mContact = (TextView) findViewById(ID_CONTACT);
        mLicense = (TextView) findViewById(ID_LICENSE);

        mHomeURL.setMovementMethod(LinkMovementMethod.getInstance());
        mContact.setMovementMethod(LinkMovementMethod.getInstance());
        mLicense.setMovementMethod(LinkMovementMethod.getInstance());

     }

}
