package com.example.android.boardingpass.databinding;
import com.example.android.boardingpass.R;
import com.example.android.boardingpass.BR;
import android.view.View;
public class ActivityMainBindingLandImpl extends ActivityMainBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(1, 
            new String[] {"flight_info", "boarding_info"},
            new int[] {2, 3},
            new int[] {R.layout.flight_info, R.layout.boarding_info});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textViewPassengerLabel, 4);
        sViewsWithIds.put(R.id.textViewPassengerName, 5);
        sViewsWithIds.put(R.id.textViewBoardingTimeLabel, 6);
        sViewsWithIds.put(R.id.textViewBoardingTime, 7);
        sViewsWithIds.put(R.id.textViewBoardingInCountdownLabel, 8);
        sViewsWithIds.put(R.id.textViewBoardingInCountdown, 9);
        sViewsWithIds.put(R.id.textViewDepartureTimeLabel, 10);
        sViewsWithIds.put(R.id.textViewDepartureTime, 11);
        sViewsWithIds.put(R.id.textViewArrivalTimeLabel, 12);
        sViewsWithIds.put(R.id.textViewArrivalTime, 13);
        sViewsWithIds.put(R.id.barcode, 14);
    }
    // views
    private final android.support.constraint.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingLandImpl(android.databinding.DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingLandImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[14]
            , (com.example.android.boardingpass.databinding.BoardingInfoBinding) bindings[3]
            , null
            , (com.example.android.boardingpass.databinding.FlightInfoBinding) bindings[2]
            , null
            , null
            , null
            , (android.widget.ScrollView) bindings[0]
            , null
            , null
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , null
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , null
            , null
            , null
            , null
            , null
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , null
            , null
            , null
            , null
            );
        this.mboundView1 = (android.support.constraint.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        flightInfo.invalidateAll();
        boardingInfo.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (flightInfo.hasPendingBindings()) {
            return true;
        }
        if (boardingInfo.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBoardingInfo((com.example.android.boardingpass.databinding.BoardingInfoBinding) object, fieldId);
            case 1 :
                return onChangeFlightInfo((com.example.android.boardingpass.databinding.FlightInfoBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBoardingInfo(com.example.android.boardingpass.databinding.BoardingInfoBinding boardingInfo, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }
    private boolean onChangeFlightInfo(com.example.android.boardingpass.databinding.FlightInfoBinding flightInfo, int fieldId) {
        switch (fieldId) {
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x2L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        flightInfo.executePendingBindings();
        boardingInfo.executePendingBindings();
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): boardingInfo
        flag 1 (0x2L): flightInfo
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}