package systems.itgroup.workshopcampauth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.auth0.android.Auth0;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;

    private TextView token;
    private Auth0 auth0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        token = findViewById(R.id.tv_token);

        auth0 = new Auth0(this);
        auth0.setOIDCConformant(true);
    }

    public void login(View view){

    }
}
