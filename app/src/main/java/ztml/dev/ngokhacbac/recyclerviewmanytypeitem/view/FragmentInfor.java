package ztml.dev.ngokhacbac.recyclerviewmanytypeitem.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ztml.dev.ngokhacbac.recyclerviewmanytypeitem.R;

public class FragmentInfor extends Fragment {
    private Button mButtonHome;
    private HandleEvents mHandleEvents;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_infor, container, false);
        mButtonHome = view.findViewById(R.id.button_home);
        mButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHandleEvents.change(0);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mHandleEvents = (HandleEvents) context;
    }
}
