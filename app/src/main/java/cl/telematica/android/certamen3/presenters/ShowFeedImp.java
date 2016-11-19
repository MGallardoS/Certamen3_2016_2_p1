package cl.telematica.android.certamen3.presenters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import cl.telematica.android.certamen3.presenters.contract.ShowFeed;

/**
 * Created by mavin on 18/11/2016.
 */

public class ShowFeedImp implements ShowFeed {

    Context context;
    private ListView mShowFeed;
    public RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;


    public ShowFeedImp(ListView mListBookView, Context context) {
        this.mShowFeed = mListBookView;
        this.context = context;

    }
    @Override
    public void createMyRecyclerView(RecyclerView.Adapter mAdapter) {
        mRecyclerView.setAdapter(mAdapter);

    }
}
