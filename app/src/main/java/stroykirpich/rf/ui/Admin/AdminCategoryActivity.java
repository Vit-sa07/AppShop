package stroykirpich.rf.ui.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import stroykirpich.rf.R;

public class AdminCategoryActivity extends AppCompatActivity {


    private ImageView oblicovachnyi, polno, giperpress;
    private ImageView barrum, lsr, jkp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        init();

        oblicovachnyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "oblicovachnyi");
                startActivity(intent);
            }
        });

        polno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "polno");
                startActivity(intent);
            }
        });

        giperpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "giperpress");
                startActivity(intent);
            }
        });

        barrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "barrum");
                startActivity(intent);
            }
        });

        lsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "lsr");
                startActivity(intent);
            }
        });

        jkp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "jkp");
                startActivity(intent);
            }
        });
    }

    private void init() {

        oblicovachnyi = findViewById(R.id.oblicovachnyi);
        polno = findViewById(R.id.polno);
        giperpress = findViewById(R.id.giperpress);

        barrum = findViewById(R.id.barrum);
        lsr = findViewById(R.id.lsr);
        jkp = findViewById(R.id.jkp);

    }
}