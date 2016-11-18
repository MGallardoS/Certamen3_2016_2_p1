package cl.telematica.android.certamen3.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.telematica.android.certamen3.R;
import cl.telematica.android.certamen3.presenters.MyAsyncTaskExecutorImp;

/**
 * Created by mavin on 18/11/2016.
 */

public class ListFragment extends Fragment {

    private MyAsyncTaskExecutorImp myAsyncTaskExecutorImp;

    public RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    public static ListFragment newInstance() {
        ListFragment fragment = new ListFragment();
        return fragment;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View mainView = inflater.inflate(R.layout.fragment_list, null);





        return mainView;
    }


}
