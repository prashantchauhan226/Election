package com.example.xyz.election.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.xyz.election.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bDeptDetails, bAeroDetails, bBoothsDetail, bVulnerableBoothDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bDeptDetails = (Button) findViewById(R.id.deptDetails);
        bAeroDetails = (Button) findViewById(R.id.aeroDetails);
        bBoothsDetail = (Button) findViewById(R.id.boothsDetails);
        bVulnerableBoothDetails = (Button) findViewById(R.id.vulnerableBoothDetails);
        bDeptDetails.setOnClickListener(this);
        bAeroDetails.setOnClickListener(this);
        bBoothsDetail.setOnClickListener(this);
        bVulnerableBoothDetails.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.deptDetails:
                Intent intentDeptDetails = new Intent(getApplication(), DeoDeptyDetails.class);
                startActivity(intentDeptDetails);
                break;

            case R.id.aeroDetails:
                Intent intentAeroDetails = new Intent(getApplication(), EroDetails.class);
                startActivity(intentAeroDetails);
                break;

            case R.id.boothsDetails:
                Intent intentBoothsDetail = new Intent(getApplication(), BoothsDetails.class);
                startActivity(intentBoothsDetail);
                break;
            case R.id.vulnerableBoothDetails:
                Intent intentVulnerableBoothDetail = new Intent(getApplication(), BoothsDetails.class);
                startActivity(intentVulnerableBoothDetail);
                break;

            default:
                break;
        }
    }
}
