package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class PhoneDialerActivity extends AppCompatActivity {

    public String phoneNumber = "";

    class DialOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            EditText phoneNumberEditText = (EditText)findViewById(R.id.phone_number_edit_text);
            switch (v.getId()) {
                case R.id.zero_button:
                    phoneNumber += '0';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.one_button:
                    phoneNumber += '1';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.two_button:
                    phoneNumber += '2';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.three_button:
                    phoneNumber += '3';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.four_button:
                    phoneNumber += '4';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.five_button:
                    phoneNumber += '5';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.six_button:
                    phoneNumber += '6';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.seven_button:
                    phoneNumber += '7';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.eight_button:
                    phoneNumber += '8';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.nine_button:
                    phoneNumber += '9';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.star_button:
                    phoneNumber += '*';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.diez_button:
                    phoneNumber += '#';
                    phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.backspace_image_button:
                    if (phoneNumber.length() > 0)
                        phoneNumber = phoneNumber.substring(0, phoneNumber.length() - 1);
                        phoneNumberEditText.setText(phoneNumber, TextView.BufferType.EDITABLE);
                    break;
                case R.id.call_image_button:
                    if (ContextCompat.checkSelfPermission(PhoneDialerActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(
                                PhoneDialerActivity.this,
                                new String[]{Manifest.permission.CALL_PHONE},
                                1);
                    } else {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + phoneNumberEditText.getText().toString()));
                        startActivity(intent);
                    }
                    break;
                case R.id.hangup_image_button:
                    finish();
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

        View.OnClickListener dialOnClickListener = new DialOnClickListener();
        Button zeroButton = (Button)findViewById(R.id.zero_button);
        Button oneButton = (Button)findViewById(R.id.one_button);
        Button twoButton = (Button)findViewById(R.id.two_button);
        Button threeButton = (Button)findViewById(R.id.three_button);
        Button fourButton = (Button)findViewById(R.id.four_button);
        Button fiveButton = (Button)findViewById(R.id.five_button);
        Button sixButton = (Button)findViewById(R.id.six_button);
        Button sevenButton = (Button)findViewById(R.id.seven_button);
        Button eightButton = (Button)findViewById(R.id.eight_button);
        Button nineButton = (Button)findViewById(R.id.nine_button);
        Button starButton = (Button)findViewById(R.id.star_button);
        Button diezButton = (Button)findViewById(R.id.diez_button);
        ImageButton backspaceButton = (ImageButton)findViewById(R.id.backspace_image_button);
        ImageButton callButton = (ImageButton)findViewById(R.id.call_image_button);
        ImageButton hangupButton = (ImageButton)findViewById(R.id.hangup_image_button);

        zeroButton.setOnClickListener(dialOnClickListener);
        oneButton.setOnClickListener(dialOnClickListener);
        twoButton.setOnClickListener(dialOnClickListener);
        threeButton.setOnClickListener(dialOnClickListener);
        fourButton.setOnClickListener(dialOnClickListener);
        fiveButton.setOnClickListener(dialOnClickListener);
        sixButton.setOnClickListener(dialOnClickListener);
        sevenButton.setOnClickListener(dialOnClickListener);
        eightButton.setOnClickListener(dialOnClickListener);
        nineButton.setOnClickListener(dialOnClickListener);
        starButton.setOnClickListener(dialOnClickListener);
        diezButton.setOnClickListener(dialOnClickListener);
        backspaceButton.setOnClickListener(dialOnClickListener);
        callButton.setOnClickListener(dialOnClickListener);
        hangupButton.setOnClickListener(dialOnClickListener);
    }
}
