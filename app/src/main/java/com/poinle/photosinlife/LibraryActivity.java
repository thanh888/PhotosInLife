package com.poinle.photosinlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.poinle.photosinlife.adapter.ViewPhotoAdapter;
import com.poinle.photosinlife.model.Image;

import java.util.ArrayList;
import java.util.List;

public class LibraryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ViewPhotoAdapter viewPhotoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        recyclerView = findViewById(R.id.rev_library);
        viewPhotoAdapter = new ViewPhotoAdapter(this);
        StaggeredGridLayoutManager layoutManager = new  StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        viewPhotoAdapter.setData(getData());
        recyclerView.setAdapter(viewPhotoAdapter);
    }

    private List<Image> getData() {
        List<Image> images = new ArrayList<>();
        images.add(new Image(R.drawable.image_1, "Photo one"));
        images.add(new Image(R.drawable.image_2, "Photo two"));
        images.add(new Image(R.drawable.image_3, "Photo three"));
        images.add(new Image(R.drawable.image_4, "Photo four"));
        images.add(new Image(R.drawable.image_5, "Photo five"));
        images.add(new Image(R.drawable.image_1, "Photo six"));
        images.add(new Image(R.drawable.image_2, "Photo seven"));
        images.add(new Image(R.drawable.image_3, "Photo eight"));
        images.add(new Image(R.drawable.image_4, "Photo nine"));
        images.add(new Image(R.drawable.image_5, "Photo ten"));
        images.add(new Image(R.drawable.image_1, "Photo eleven"));
        images.add(new Image(R.drawable.image_2, "Photo twelfth"));
        images.add(new Image(R.drawable.image_3, "Photo thirteen"));
        images.add(new Image(R.drawable.image_4, "Photo fourteen"));
        images.add(new Image(R.drawable.image_5, "Photo fifteen"));
        return images;
    }
}