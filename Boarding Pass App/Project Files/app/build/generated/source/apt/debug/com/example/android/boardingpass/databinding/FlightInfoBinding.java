package com.example.android.boardingpass.databinding;
import com.example.android.boardingpass.R;
import com.example.android.boardingpass.BR;
import android.view.View;
public class FlightInfoBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.leftRectangle, 1);
        sViewsWithIds.put(R.id.divider, 2);
        sViewsWithIds.put(R.id.rightRectangle, 3);
        sViewsWithIds.put(R.id.textViewOriginAirport, 4);
        sViewsWithIds.put(R.id.textViewDestinationAirport, 5);
        sViewsWithIds.put(R.id.imagePlane, 6);
        sViewsWithIds.put(R.id.textViewFlightCode, 7);
    }
    // views
    public final android.widget.ImageView divider;
    public final android.widget.ImageView imagePlane;
    public final android.widget.ImageView leftRectangle;
    private final android.support.constraint.ConstraintLayout mboundView0;
    public final android.widget.ImageView rightRectangle;
    public final android.widget.TextView textViewDestinationAirport;
    public final android.widget.TextView textViewFlightCode;
    public final android.widget.TextView textViewOriginAirport;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FlightInfoBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds);
        this.divider = (android.widget.ImageView) bindings[2];
        this.imagePlane = (android.widget.ImageView) bindings[6];
        this.leftRectangle = (android.widget.ImageView) bindings[1];
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.rightRectangle = (android.widget.ImageView) bindings[3];
        this.textViewDestinationAirport = (android.widget.TextView) bindings[5];
        this.textViewFlightCode = (android.widget.TextView) bindings[7];
        this.textViewOriginAirport = (android.widget.TextView) bindings[4];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static FlightInfoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FlightInfoBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<FlightInfoBinding>inflate(inflater, com.example.android.boardingpass.R.layout.flight_info, root, attachToRoot, bindingComponent);
    }
    public static FlightInfoBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FlightInfoBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.android.boardingpass.R.layout.flight_info, null, false), bindingComponent);
    }
    public static FlightInfoBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static FlightInfoBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/flight_info_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new FlightInfoBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}