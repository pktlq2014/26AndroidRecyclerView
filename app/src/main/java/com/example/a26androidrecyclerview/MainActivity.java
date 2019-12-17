package com.example.a26androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

//        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(MainActivity.this, linearLayoutManager.getOrientation());
//        recyclerView.addItemDecoration(dividerItemDecoration);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.HORIZONTAL);
        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.custom_divider);
        dividerItemDecoration.setDrawable(drawable);
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<DataShop> arrayList = new ArrayList<>();
        arrayList.add(new DataShop(R.drawable.banhtrangtron, "Bánh Tráng Trộn"));
        arrayList.add(new DataShop(R.drawable.botchien, "Bột Chiên"));
        arrayList.add(new DataShop(R.drawable.hutieu, "Hủ Tiếu"));
        arrayList.add(new DataShop(R.drawable.supcua, "Súp Cua"));
        arrayList.add(new DataShop(R.drawable.trasu, "Trà Sữa"));
        arrayList.add(new DataShop(R.drawable.vuheo, "Vú Heo"));
        ShopAdapter shopAdapter = new ShopAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(shopAdapter);
    }
}
