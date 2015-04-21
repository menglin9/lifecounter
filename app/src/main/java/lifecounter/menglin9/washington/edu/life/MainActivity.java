package lifecounter.menglin9.washington.edu.life;

import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    int s1 = 20;
    int s2 = 20;
    int s3 = 20;
    int s4 = 20;
    int s5 = 20;
    int s6 = 20;
    int s7 = 20;
    int s8 = 20;
    int playerN = 2;
    String message = "Now Playing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.i("Q","create");
        setUp();
    }

    // Helper method for calculating and setting values for each player when button clicked
    private void counter(int id, final int value, final TextView vt, final TextView result, final String s) {
        //set the first button
        final Button b1_m1 = (Button) findViewById(id);
        b1_m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.equals("ss1")) {
                    s1 = s1 + value;
                    vt.setText("" + s1);
                    if (s1 <= 0) {
                        message = "Player 1 LOSES!";
                        result.setText(message);
                    }
                } else if (s.equals("ss2")) {
                    s2 = s2 + value;
                    vt.setText("" + s2);
                    if (s2 <= 0) {
                        message = "Player 2 LOSES!";
                        result.setText(message);
                    }
                } else if (s.equals("ss3")) {
                    s3 = s3 + value;
                    vt.setText("" + s3);
                    if (s3 <= 0) {
                        message = "Player 3 LOSES!";
                        result.setText(message);
                    }
                } else if (s.equals("ss4")) {
                    s4 = s4 + value;
                    vt.setText("" + s4);
                    if (s4 <= 0) {
                        message = "Player 4 LOSES!";
                        result.setText(message);
                    }
                } else if (s.equals("ss4")) {
                    s4 = s4 + value;
                    vt.setText("" + s4);
                    if (s4 <= 0) {
                        message = "Player 4 LOSES!";
                        result.setText(message);
                    }
                } else if (s.equals("ss5")) {
                    s5 = s5 + value;
                    vt.setText("" + s5);
                    if (s5 <= 0) {
                        message = "Player 5 LOSES!";
                        result.setText(message);
                    }
                } else if (s.equals("ss6")) {
                    s6 = s6 + value;
                    vt.setText("" + s6);
                    if (s6 <= 0) {
                        message = "Player 6 LOSES!";
                        result.setText(message);
                    }
                } else if (s.equals("ss7")) {
                    s7 = s7 + value;
                    vt.setText("" + s7);
                    if (s7 <= 0) {
                        message = "Player 7 LOSES!";
                        result.setText(message);
                    }
                } else if (s.equals("ss8")) {
                    s8 = s8 + value;
                    vt.setText("" + s8);
                    if (s8 <= 0) {
                        message = "Player 8 LOSES!";
                        result.setText(message);
                    }
                }
            }
        });
    }

    //add players when the add button has been clicked
    private void addPlayer() {
        final Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerN++;
                if (playerN < 9) {
                    int resID = getResources().getIdentifier("player" + playerN, "id", getPackageName());
                    LinearLayout player = (LinearLayout) findViewById(resID);
                    player.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    // Reset the scores to initial value and also reset the player to two
    private void reset() {
        final Button reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = 20;
                s2 = 20;
                s3 = 20;
                s4 = 20;
                s5 = 20;
                s6 = 20;
                s7 = 20;
                s8 = 20;
                message = "Now Playing";
                playerN = 2;
                setUp();
            }
        });
    }

    private void setUp() {
        setContentView(R.layout.activity_main);
        final TextView t1 = (TextView) findViewById(R.id.t1);
        t1.setText("" + s1);
        final TextView t2 = (TextView) findViewById(R.id.t2);
        t2.setText("" + s2);
        final TextView t3 = (TextView) findViewById(R.id.t3);
        t3.setText("" + s3);
        final TextView t4 = (TextView) findViewById(R.id.t4);
        t4.setText("" + s4);
        final TextView t5 = (TextView) findViewById(R.id.t5);
        t1.setText("" + s5);
        final TextView t6 = (TextView) findViewById(R.id.t6);
        t2.setText("" + s6);
        final TextView t7 = (TextView) findViewById(R.id.t7);
        t3.setText("" + s7);
        final TextView t8 = (TextView) findViewById(R.id.t8);
        t4.setText("" + s8);
        final TextView result = (TextView) findViewById(R.id.result);
        result.setText(message);

        // first 4 players
        counter(R.id.b1_m1, -1, t1, result, "ss1");
        counter(R.id.b1_p1, 1, t1, result, "ss1");
        counter(R.id.b1_m5, -5, t1, result, "ss1");
        counter(R.id.b1_p5, 5, t1, result, "ss1");
        counter(R.id.b2_m1, -1, t2, result, "ss2");
        counter(R.id.b2_p1, 1, t2, result, "ss2");
        counter(R.id.b2_m5, -5, t2, result, "ss2");
        counter(R.id.b2_p5, 5, t2, result, "ss2");
        counter(R.id.b3_m1, -1, t3, result, "ss3");
        counter(R.id.b3_p1, 1, t3, result, "ss3");
        counter(R.id.b3_m5, -5, t3, result, "ss3");
        counter(R.id.b3_p5, 5, t3, result, "ss3");
        counter(R.id.b4_m1, -1, t4, result, "ss4");
        counter(R.id.b4_p1, 1, t4, result, "ss4");
        counter(R.id.b4_m5, -5, t4, result, "ss4");
        counter(R.id.b4_p5, 5, t4, result, "ss4");

        //second four players
        counter(R.id.b5_m1, -1, t5, result, "ss5");
        counter(R.id.b5_p1, 1, t5, result, "ss5");
        counter(R.id.b5_m5, -5, t5, result, "ss5");
        counter(R.id.b5_p5, 5, t5, result, "ss5");
        counter(R.id.b6_m1, -1, t6, result, "ss6");
        counter(R.id.b6_p1, 1, t6, result, "ss6");
        counter(R.id.b6_m5, -5, t6, result, "ss6");
        counter(R.id.b6_p5, 5, t6, result, "ss6");
        counter(R.id.b7_m1, -1, t7, result, "ss7");
        counter(R.id.b7_p1, 1, t7, result, "ss7");
        counter(R.id.b7_m5, -5, t7, result, "ss7");
        counter(R.id.b7_p5, 5, t7, result, "ss7");
        counter(R.id.b8_m1, -1, t8, result, "ss8");
        counter(R.id.b8_p1, 1, t8, result, "ss8");
        counter(R.id.b8_m5, -5, t8, result, "ss8");
        counter(R.id.b8_p5, 5, t8, result, "ss8");

        //call for addPlayers
        addPlayer();
        reset();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
    // Rewrite the configurationChanged function inorder to keep the data when the screen transfer
    // between landscape and portrait
    @Override
         public void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            Log.e("Q","COM");
            // Checks the orientation of the screen for landscape and portrait
            if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
                //playerN = 2;
                setUp();
            } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
                Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
                //playerN = 2;
                setUp();

            }
         }
     */
}
