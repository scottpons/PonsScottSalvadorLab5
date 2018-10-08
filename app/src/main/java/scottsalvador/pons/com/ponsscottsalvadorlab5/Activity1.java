package scottsalvador.pons.com.ponsscottsalvadorlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Log.d("4itf","onCreate has executed...");
        Log.d("4itf","Activity1 is active...");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4itf","onStart has executed...");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4itf","onResume has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf","onPause runs");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf","onStop has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf","onRestart has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf","object is deallocated");
    }


    public void viewMap1(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btn_map1) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:?q=loc:"+"14.585770"+","+"121.059930(Discovery Suites Manila)"));
            chooser = Intent.createChooser(i, "Choose Your Map App");
            startActivity(chooser);
        }
    }

    public void displaySecond(View v) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }
}
