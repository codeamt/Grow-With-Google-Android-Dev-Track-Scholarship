package com.example.android.boardingpass.databinding;
import android.databinding.Bindable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
public abstract class ActivityMainBinding extends ViewDataBinding {
    public final android.widget.ImageView barcode;
    public final com.example.android.boardingpass.databinding.BoardingInfoBinding boardingInfo;
    public final android.widget.ImageView divider;
    public final com.example.android.boardingpass.databinding.FlightInfoBinding flightInfo;
    public final android.widget.ImageView imagePlane;
    public final android.widget.ImageView leftRectangle;
    public final android.widget.ImageView rightRectangle;
    public final android.widget.ScrollView scroll;
    public final android.widget.ImageView tableHeaderImage;
    public final android.widget.ImageView tableImage;
    public final android.widget.TextView textViewArrivalTime;
    public final android.widget.TextView textViewArrivalTimeLabel;
    public final android.widget.TextView textViewBoardingInCountdown;
    public final android.widget.TextView textViewBoardingInCountdownLabel;
    public final android.widget.TextView textViewBoardingInTimeLabel;
    public final android.widget.TextView textViewBoardingTime;
    public final android.widget.TextView textViewBoardingTimeLabel;
    public final android.widget.TextView textViewDepartureTime;
    public final android.widget.TextView textViewDepartureTimeLabel;
    public final android.widget.TextView textViewDestinationAirport;
    public final android.widget.TextView textViewFlightCode;
    public final android.widget.TextView textViewGate;
    public final android.widget.TextView textViewGateLabel;
    public final android.widget.TextView textViewOriginAirport;
    public final android.widget.TextView textViewPassengerLabel;
    public final android.widget.TextView textViewPassengerName;
    public final android.widget.TextView textViewSeat;
    public final android.widget.TextView textViewSeatLabel;
    public final android.widget.TextView textViewTerminal;
    public final android.widget.TextView textViewTerminalLabel;
    protected ActivityMainBinding(android.databinding.DataBindingComponent bindingComponent, android.view.View root_, int localFieldCount
        , android.widget.ImageView barcode
        , com.example.android.boardingpass.databinding.BoardingInfoBinding boardingInfo
        , android.widget.ImageView divider
        , com.example.android.boardingpass.databinding.FlightInfoBinding flightInfo
        , android.widget.ImageView imagePlane
        , android.widget.ImageView leftRectangle
        , android.widget.ImageView rightRectangle
        , android.widget.ScrollView scroll
        , android.widget.ImageView tableHeaderImage
        , android.widget.ImageView tableImage
        , android.widget.TextView textViewArrivalTime
        , android.widget.TextView textViewArrivalTimeL
        , android.widget.TextView textViewBoardingInCo
        , android.widget.TextView textViewBoardingInCo1
        , android.widget.TextView textViewBoardingInTi
        , android.widget.TextView textViewBoardingTime
        , android.widget.TextView textViewBoardingTime1
        , android.widget.TextView textViewDepartureTim
        , android.widget.TextView textViewDepartureTim1
        , android.widget.TextView textViewDestinationA
        , android.widget.TextView textViewFlightCode
        , android.widget.TextView textViewGate
        , android.widget.TextView textViewGateLabel
        , android.widget.TextView textViewOriginAirpor
        , android.widget.TextView textViewPassengerLab
        , android.widget.TextView textViewPassengerNam
        , android.widget.TextView textViewSeat
        , android.widget.TextView textViewSeatLabel
        , android.widget.TextView textViewTerminal
        , android.widget.TextView textViewTerminalLabe
    ) {
        super(bindingComponent, root_, localFieldCount);
        this.barcode = barcode;
        this.boardingInfo = boardingInfo;
        this.divider = divider;
        this.flightInfo = flightInfo;
        this.imagePlane = imagePlane;
        this.leftRectangle = leftRectangle;
        this.rightRectangle = rightRectangle;
        this.scroll = scroll;
        this.tableHeaderImage = tableHeaderImage;
        this.tableImage = tableImage;
        this.textViewArrivalTime = textViewArrivalTime;
        this.textViewArrivalTimeLabel = textViewArrivalTimeL;
        this.textViewBoardingInCountdown = textViewBoardingInCo;
        this.textViewBoardingInCountdownLabel = textViewBoardingInCo1;
        this.textViewBoardingInTimeLabel = textViewBoardingInTi;
        this.textViewBoardingTime = textViewBoardingTime;
        this.textViewBoardingTimeLabel = textViewBoardingTime1;
        this.textViewDepartureTime = textViewDepartureTim;
        this.textViewDepartureTimeLabel = textViewDepartureTim1;
        this.textViewDestinationAirport = textViewDestinationA;
        this.textViewFlightCode = textViewFlightCode;
        this.textViewGate = textViewGate;
        this.textViewGateLabel = textViewGateLabel;
        this.textViewOriginAirport = textViewOriginAirpor;
        this.textViewPassengerLabel = textViewPassengerLab;
        this.textViewPassengerName = textViewPassengerNam;
        this.textViewSeat = textViewSeat;
        this.textViewSeatLabel = textViewSeatLabel;
        this.textViewTerminal = textViewTerminal;
        this.textViewTerminalLabel = textViewTerminalLabe;
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.android.boardingpass.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.android.boardingpass.R.layout.activity_main, null, false, bindingComponent);
    }
    public static ActivityMainBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        return (ActivityMainBinding)bind(bindingComponent, view, com.example.android.boardingpass.R.layout.activity_main);
    }
}