package com.kuo.examplemvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.kuo.examplemvp.presenter.FindItemPresenter;
import com.kuo.examplemvp.presenter.FindItemPresenterImpl;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FindItemView {

    private FindItemPresenter findItemPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();

        findItemPresenter = new FindItemPresenterImpl(this);
    }

    private void initButton() {

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findItemPresenter.onStartFind();
            }
        });

    }

    @Override
    public void setItem(ArrayList<Integer> integers) {

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Find " + integers.size() + " item.");

    }
}
