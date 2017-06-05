package ganesh.com.buttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleButton(View view) {
        Toast.makeText(getApplicationContext(), "This is Simple Android Button", Toast.LENGTH_LONG).show();
    }

    public void leftIconButton(View view) {
        Toast.makeText(getApplicationContext(), "Android Button With Icon in Left", Toast.LENGTH_LONG).show();
    }

    public void rightIconButton(View view) {
        Toast.makeText(getApplicationContext(), "Android Button With Icon in Right", Toast.LENGTH_LONG).show();
    }

    public void backgroundImageButton(View view) {
        Toast.makeText(getApplicationContext(), "Android Button With Background Image", Toast.LENGTH_LONG).show();
    }

    public void borderButton(View view) {
        Toast.makeText(getApplicationContext(), "Android Button With Border Color", Toast.LENGTH_LONG).show();
    }

    public void borderRadiusButton(View view) {
        Toast.makeText(getApplicationContext(), "Android Button With Border Radius", Toast.LENGTH_LONG).show();
    }

    public void roundButton(View view) {
        Toast.makeText(getApplicationContext(), "Android Round Button", Toast.LENGTH_LONG).show();
    }

}