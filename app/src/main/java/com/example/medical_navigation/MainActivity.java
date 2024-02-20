import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2초 후에 loginpage.xml로 전환
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent를 사용하여 다음 화면으로 전환
                Intent intent = new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent);

                // 현재 액티비티 종료
                finish();
            }
        }, 2000); // 2000 밀리초 = 2초
    }
}
