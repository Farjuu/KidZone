package dev.farjana.kidzone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {
    Intent intent;
    Button LogInButton;
    EditText nameEditText, emailEditText;
    String name,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
       /* requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
*/
        initializeAll();
        saveData();
        click();
    }

    private void saveData() {
        name = nameEditText.getText().toString();
        email = emailEditText.getText().toString();
    }

    private void click() {
        LogInButton.setOnClickListener(view -> {
            intent = new Intent(LogInActivity.this,DashBoardActivity.class);
            intent.putExtra("UserName",name);
            startActivity(intent);
            finish();
        });
    }

    private void initializeAll() {
        LogInButton = findViewById(R.id.logInBtn);
        nameEditText = findViewById(R.id.editTextName);
        emailEditText = findViewById(R.id.editTextEmail);
    }
}