package lessmeaning.easymessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MainActivity activity;
    Button mButton;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LocalCore localCore = new LocalCore(MainActivity activity);
        mButton = (Button) findViewById(R.id.button);
        mListView = (ListView) findViewById(R.id.list_view);
        mButton.setOnClickListener(this);
    }
    @Override
    public void onClick (View v) {
        if (v.getId() == mButton.getId()) {
            localCore.addTemp(inf);
        }
    }

    public void
}
