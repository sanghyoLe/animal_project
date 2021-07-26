package com.example.animal_project;

import android.app.AlertDialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.animal_project.Freestall.ProtocolFour.FreestallAvoidDistance;
import com.example.animal_project.Freestall.ProtocolFour.FreestallStruggle;
import com.example.animal_project.Freestall.ProtocolOne.FreestallPoor;
import com.example.animal_project.Freestall.ProtocolOne.FreestallWaterQ1;
import com.example.animal_project.Freestall.ProtocolOne.FreestallWaterQ1_1;
import com.example.animal_project.Freestall.ProtocolOne.FreestallWaterQ1_2;
import com.example.animal_project.Freestall.ProtocolOne.FreestallWaterQ2;
import com.example.animal_project.Freestall.ProtocolOne.FreestallWaterQ3;
import com.example.animal_project.Freestall.ProtocolThree.FreestallAstasia;
import com.example.animal_project.Freestall.ProtocolThree.FreestallBreast;
import com.example.animal_project.Freestall.ProtocolThree.FreestallCriticalHairloss;
import com.example.animal_project.Freestall.ProtocolThree.FreestallCriticalLimp;
import com.example.animal_project.Freestall.ProtocolThree.FreestallDiarrhea;
import com.example.animal_project.Freestall.ProtocolThree.FreestallDystocia;
import com.example.animal_project.Freestall.ProtocolThree.FreestallFallDead;
import com.example.animal_project.Freestall.ProtocolThree.FreestallHornQ1;
import com.example.animal_project.Freestall.ProtocolThree.FreestallHornQ2;
import com.example.animal_project.Freestall.ProtocolThree.FreestallHornQ3;
import com.example.animal_project.Freestall.ProtocolThree.FreestallOphthalmic;
import com.example.animal_project.Freestall.ProtocolThree.FreestallOutGenitals;
import com.example.animal_project.Freestall.ProtocolThree.FreestallRespiratory;
import com.example.animal_project.Freestall.ProtocolThree.FreestallRunnyNose;
import com.example.animal_project.Freestall.ProtocolThree.FreestallSlightHairloss;
import com.example.animal_project.Freestall.ProtocolThree.FreestallSlightLimp;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallAppearanceQ1;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallAppearanceQ2;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallAppearanceQ3;

import com.example.animal_project.BreedBatch.ProtocolFour.BreedAvoidDistance;
import com.example.animal_project.BreedBatch.ProtocolFour.BreedHarmony;
import com.example.animal_project.BreedBatch.ProtocolFour.BreedStruggle;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedBreath;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedCastrationQ1;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedCastrationQ2;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedCastrationQ3;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedCough;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedCriticalHairLoss;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedDiarrhea;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedFallDead;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedHornQ1;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedHornQ2;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedHornQ3;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedOphthalmic;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedRuminant;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedRunnyNose;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedSlightHairLoss;
import com.example.animal_project.BreedBatch.ProtocolThree.BreedLimp;
import com.example.animal_project.BreedBatch.ProtocolTwo.BreedMistSpray;
import com.example.animal_project.BreedBatch.ProtocolTwo.BreedOutward;
import com.example.animal_project.BreedBatch.ProtocolOne.BreedPoor;
import com.example.animal_project.BreedBatch.ProtocolTwo.BreedShade;
import com.example.animal_project.BreedBatch.ProtocolTwo.BreedStraw;
import com.example.animal_project.BreedBatch.ProtocolTwo.BreedSummerVentilating;
import com.example.animal_project.BreedBatch.ProtocolOne.BreedWaterQ1;
import com.example.animal_project.BreedBatch.ProtocolOne.BreedWaterQ2;
import com.example.animal_project.BreedBatch.ProtocolOne.BreedWaterQ3;
import com.example.animal_project.BreedBatch.ProtocolTwo.BreedWindBlock;
import com.example.animal_project.BreedBatch.ProtocolTwo.BreedWinterVentilating;
import com.example.animal_project.BreedBatch.ProtocolTwo.CalfMistSpray;
import com.example.animal_project.BreedBatch.ProtocolTwo.CalfShade;
import com.example.animal_project.BreedBatch.ProtocolTwo.CalfStraw;
import com.example.animal_project.BreedBatch.ProtocolTwo.CalfSummerVentilating;
import com.example.animal_project.BreedBatch.ProtocolTwo.CalfWarm;
import com.example.animal_project.BreedBatch.ProtocolTwo.CalfWindBlock;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallAreaOutCollision;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallCalfMistSpray;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallCalfShade;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallCalfStraw;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallCalfSummerVentilating;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallCalfWarm;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallCalfWindBlock;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallCount;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallMistSpray;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallShade;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallSitCollision;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallSitTime;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallSummerVentilating;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallWindBlock;
import com.example.animal_project.Freestall.ProtocolTwo.FreestallWinterVentilating;
import com.example.animal_project.Result.ResultTotal;
import com.example.animal_project.Result.Result_1;
import com.example.animal_project.Result.Result_2;
import com.example.animal_project.Result.Result_3;
import com.example.animal_project.Result.Result_4;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;


public class QuestionTemplate extends AppCompatActivity
{
    public static Context context_question_template;


    // 정보 입력 창에서 넘어온 정보들
    private String farmName;
    private String address;
    private String addressDetail;
    private String repName;
    private int totalCowSize;
    private int totalAdultCow;
    private int totalChildCow;
    private String evaName;
    private String evaDate;
    private int farmType = 0;
    private int sampleCowSize;
    // ------------------------------
    // --- 결과 창 ---
    ResultTotal result_total;
    Result_1 result1;
    Result_2 result2;
    Result_3 result3;
    Result_4 result4;
    TabLayout tabs;
    Bundle bundle;
    // --------------------------------------------------------
    private LinearLayout fragment_paper;
    private LinearLayout question_top_nav;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    // 한 육우 프로토콜 질문 항목 Fragments
    private BreedPoor breed_poor;
    private BreedWaterQ1 breed_water_q1;
    private BreedWaterQ2 breed_water_q2;
    private BreedWaterQ3 breed_water_q3;
    private BreedStraw breed_straw;
    private BreedOutward breed_outward;
    private BreedShade breed_shade;
    private BreedSummerVentilating breed_summer_ventilating;
    private BreedMistSpray breed_mist_spray;
    private BreedWindBlock breed_wind_block;
    private BreedWinterVentilating breed_winter_ventilating;
    private CalfShade calf_shade;
    private CalfSummerVentilating calf_summer_ventilating;
    private CalfMistSpray calf_mist_spray;
    private CalfStraw calf_straw;
    private CalfWarm calf_warm;
    private CalfWindBlock calf_wind_block;
    private BreedLimp breed_limp;
    private BreedSlightHairLoss breed_slight_hair_loss;
    private BreedCriticalHairLoss breed_critical_hair_loss;
    private BreedCough breed_cough;
    private BreedRunnyNose breed_runny_nose;
    private BreedOphthalmic breed_ophthalmic;
    private BreedBreath breed_breath;
    private BreedDiarrhea breed_diarrhea;
    private BreedRuminant breed_ruminant;
    private BreedFallDead breed_fall_dead;
    private BreedHornQ1 breed_horn_q1;
    private BreedHornQ2 breed_horn_q2;
    private BreedHornQ3 breed_horn_q3;
    private BreedCastrationQ1 breed_castration_q1;
    private BreedCastrationQ2 breed_castration_q2;
    private BreedCastrationQ3 breed_castration_q3;
    private BreedStruggle breed_struggle;
    private BreedHarmony breed_harmony;
    private BreedAvoidDistance breed_avoid_distance;
    // ---------------------------------------


    // --- UI에 사용되는 버튼들 ---------------------------
    private TextView current_page;
    private TextView total_page;
    private ImageButton prev_btn;
    private ImageButton next_btn;
    private Button end_btn;
    private ImageButton list_btn;
    private ImageButton list_menu_btn_1;
    private ImageButton list_menu_btn_2;
    private ImageButton list_menu_btn_3;
    private ImageButton list_menu_btn_4;
    // --------------------------------------------------------


    // 한 육우 프로토콜 질문 항목 fragments 를 담는 배열
    private Fragment[] breed_frag_arr = new Fragment[20];
    // freestall
    private FreestallPoor freestall_poor;
    private FreestallWaterQ1 freestall_water_q1;
    private FreestallWaterQ1_1 freestall_water_q1_1;
    private FreestallWaterQ1_2 freestall_water_q1_2;
    private FreestallWaterQ2 freestall_water_q2;
    private FreestallWaterQ3 freestall_water_q3;
    private FreestallCount freestall_count;
    private FreestallSitCollision freestall_sit_collision;
    private FreestallAreaOutCollision freestall_area_out_collision;
    private FreestallSitTime freestall_sit_time;
    private FreestallAppearanceQ1 freestall_appearance_q1;
    private FreestallAppearanceQ2 freestall_appearance_q2;
    private FreestallAppearanceQ3 freestall_appearance_q3;
    private FreestallShade freestall_shade;
    private FreestallSummerVentilating freestall_summer_ventilating;
    private FreestallMistSpray freestall_mist_spray;
    private FreestallWindBlock freestall_wind_block;
    private FreestallWinterVentilating freestall_winter_ventilating;
    private FreestallCalfShade freestall_calf_shade;
    private FreestallCalfSummerVentilating freestall_calf_summer_ventilating;
    private FreestallCalfMistSpray freestall_calf_mist_spray;
    private FreestallCalfStraw freestall_calf_straw;
    private FreestallCalfWarm freestall_calf_warm;
    private FreestallCalfWindBlock freestall_calf_wind_block;
    private FreestallSlightLimp freestall_slight_limp;
    private FreestallCriticalLimp freestall_critical_limp;
    private FreestallSlightHairloss freestall_slight_hairloss;
    private FreestallCriticalHairloss freestall_critical_hairloss;
    private FreestallRunnyNose freestall_runnynose;
    private FreestallOphthalmic freestall_ophthalmic;
    private FreestallRespiratory freestall_respiratory;
    private FreestallDiarrhea freestall_diarrhea;
    private FreestallOutGenitals freestall_outgenitals;
    private FreestallBreast freestall_breast;
    private FreestallFallDead freestall_falldead;
    private FreestallDystocia freestall_dystocia;
    private FreestallAstasia freestall_astasia;
    private FreestallHornQ1 freestall_horn_q1;
    private FreestallHornQ2 freestall_horn_q2;
    private FreestallHornQ3 freestall_horn_q3;
    private FreestallStruggle freestall_struggle;
    private FreestallAvoidDistance freestall_avoid_distance;



    private Fragment[] freestall_frag_arr = new Fragment[20];

    int count = 0;
    QuestionTemplateViewModel viewModel;
    MilkCowViewModel viewModelMilk;
    AlertDialog.Builder myAlertBuilder;




    // 사용자가 이전 안드로이드 이전 버튼 눌렀을 때 처리를 위한 Override
    @Override
    public void onBackPressed(){
        myOnBackPressed(myAlertBuilder);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_template);
        myAlertBuilder = new AlertDialog.Builder(QuestionTemplate.this);

        // 결과 창 fragments  ?Activity 로 변경할 지 고민중(변경 시 모든 정보 Bundle 로 결과창에 넘겨주어야 함) ----------------------
        result_total = new ResultTotal();
        result1 = new Result_1();
        result2 = new Result_2();
        result3 = new Result_3();
        result4 = new Result_4();
        // ------------------------------------------

        viewModel = new ViewModelProvider(this).get(QuestionTemplateViewModel.class);
        viewModelMilk = new ViewModelProvider(this).get(MilkCowViewModel.class);
        // 회피거리 배열 초기화
        viewModel.setAvoidDistances();
        fragmentManager = getSupportFragmentManager();



        next_btn = findViewById(R.id.next_btn);
        prev_btn = findViewById(R.id.previous_btn);
        current_page = findViewById(R.id.current_page);
        total_page = findViewById(R.id.total_page);
        end_btn = findViewById(R.id.end_btn);
        list_btn = findViewById(R.id.list_btn);
        list_menu_btn_1 = findViewById(R.id.list_menu_btn_1);
        list_menu_btn_2 = findViewById(R.id.list_menu_btn_2);
        list_menu_btn_3 = findViewById(R.id.list_menu_btn_3);
        list_menu_btn_4 = findViewById(R.id.list_menu_btn_4);
        fragment_paper = findViewById(R.id.fragment_paper);
        question_top_nav = findViewById(R.id.question_top_nav);

        // 평가를 위한 프래그먼트들
        breed_poor = new BreedPoor();
        breed_water_q1 = new BreedWaterQ1();
        breed_water_q2 = new BreedWaterQ2();
        breed_water_q3 = new BreedWaterQ3();
        breed_straw = new BreedStraw();
        breed_outward = new BreedOutward();
        breed_shade = new BreedShade();
        breed_summer_ventilating = new BreedSummerVentilating();
        breed_mist_spray = new BreedMistSpray();
        breed_wind_block = new BreedWindBlock();
        breed_winter_ventilating = new BreedWinterVentilating();
        calf_shade = new CalfShade();
        calf_summer_ventilating = new CalfSummerVentilating();
        calf_mist_spray = new CalfMistSpray();
        calf_straw = new CalfStraw();
        calf_warm = new CalfWarm();
        calf_wind_block = new CalfWindBlock();
        breed_limp = new BreedLimp();
        breed_slight_hair_loss = new BreedSlightHairLoss();
        breed_critical_hair_loss = new BreedCriticalHairLoss();
        breed_cough = new BreedCough();
        breed_runny_nose = new BreedRunnyNose();
        breed_ophthalmic = new BreedOphthalmic();
        breed_breath = new BreedBreath();
        breed_diarrhea = new BreedDiarrhea();
        breed_ruminant = new BreedRuminant();
        breed_fall_dead = new BreedFallDead();
        breed_horn_q1 = new BreedHornQ1();
        breed_horn_q2 = new BreedHornQ2();
        breed_horn_q3 = new BreedHornQ3();
        breed_castration_q1 = new BreedCastrationQ1();
        breed_castration_q2 = new BreedCastrationQ2();
        breed_castration_q3 = new BreedCastrationQ3();
        breed_struggle = new BreedStruggle();
        breed_harmony = new BreedHarmony();
        breed_avoid_distance = new BreedAvoidDistance();



        // 프리스톨
        freestall_poor = new FreestallPoor();
        freestall_water_q1 = new FreestallWaterQ1();
        freestall_water_q1_1 = new FreestallWaterQ1_1();
        freestall_water_q1_2 = new FreestallWaterQ1_2();
        freestall_water_q2 = new FreestallWaterQ2();
        freestall_water_q3 = new FreestallWaterQ3();
        freestall_count = new FreestallCount();
        freestall_sit_collision = new FreestallSitCollision();
        freestall_area_out_collision = new FreestallAreaOutCollision();
        freestall_sit_time = new FreestallSitTime();
        freestall_appearance_q1 = new FreestallAppearanceQ1();
        freestall_appearance_q2 = new FreestallAppearanceQ2();
        freestall_appearance_q3 = new FreestallAppearanceQ3();

        freestall_shade = new FreestallShade();
        freestall_summer_ventilating = new FreestallSummerVentilating();
        freestall_mist_spray = new FreestallMistSpray();
        freestall_wind_block = new FreestallWindBlock();
        freestall_winter_ventilating = new FreestallWinterVentilating();
        freestall_calf_shade = new FreestallCalfShade();
        freestall_calf_summer_ventilating = new FreestallCalfSummerVentilating();
        freestall_calf_mist_spray = new FreestallCalfMistSpray();
        freestall_calf_straw = new FreestallCalfStraw();
        freestall_calf_warm = new FreestallCalfWarm();
        freestall_calf_wind_block = new FreestallCalfWindBlock();
        freestall_slight_limp = new FreestallSlightLimp();
        freestall_critical_limp = new FreestallCriticalLimp();
        freestall_slight_hairloss = new FreestallSlightHairloss();
        freestall_critical_hairloss = new FreestallCriticalHairloss();
        freestall_runnynose = new FreestallRunnyNose();
        freestall_ophthalmic = new FreestallOphthalmic();
        freestall_respiratory = new FreestallRespiratory();
        freestall_diarrhea = new FreestallDiarrhea();
        freestall_outgenitals = new FreestallOutGenitals();
        freestall_breast = new FreestallBreast();
        freestall_falldead = new FreestallFallDead();
        freestall_dystocia = new FreestallDystocia();
        freestall_astasia = new FreestallAstasia();
        freestall_horn_q1 = new FreestallHornQ1();
        freestall_horn_q2 = new FreestallHornQ2();
        freestall_horn_q3 = new FreestallHornQ3();
        freestall_struggle = new FreestallStruggle();
        freestall_avoid_distance = new FreestallAvoidDistance();

        // 마지막 페이지 개수 지정

        Intent intent = getIntent();
        Bundle BeforeBundle = intent.getExtras();

        // ----- 실제 서비스에서 저장되어야 하는 정보 ----
        farmName = BeforeBundle.getString("farmName");
        address = BeforeBundle.getString("address");
        addressDetail = BeforeBundle.getString("addressDetail");
        repName = BeforeBundle.getString("repName");
        totalCowSize = BeforeBundle.getInt("totalCow");
        totalAdultCow = BeforeBundle.getInt("totalAdultCow");
        totalChildCow = BeforeBundle.getInt("totalChildCow");
        evaName = BeforeBundle.getString("evaName");
        evaDate = BeforeBundle.getString("evaDate");
        farmType = BeforeBundle.getInt("farmType");
        sampleCowSize = BeforeBundle.getInt("sampleCowSize");
        // 정보 잘 넘어 오는지 로그  -------------------------------------
        Log.d("farmName",String.valueOf(farmName));
        Log.d("address",String.valueOf(address));
        Log.d("detail",String.valueOf(addressDetail));
        Log.d("repName",String.valueOf(repName));
        Log.d("totalCowSize",String.valueOf(totalCowSize));
        Log.d("totalAdultCow",String.valueOf(totalAdultCow));
        Log.d("totalChildCow",String.valueOf(totalChildCow));
        Log.d("evaName",String.valueOf(evaName));
        Log.d("evaDate",String.valueOf(evaDate));
        Log.d("farmType",String.valueOf(farmType));
        Log.d("sampleCowSize",String.valueOf(sampleCowSize));
        // -----------------------------------------------

        // ------------------------------------------------

        // ---- 테스트를 위한 최소 정보 ---------
/*        farmType = BeforeBundle.getInt("farmType");
        totalCowSize = BeforeBundle.getInt("totalCow");
        sampleCowSize = BeforeBundle.getInt("sampleCowSize");*/
        // ------------------------------------
        viewModel.setSampleCowSize(sampleCowSize);
        viewModel.setTotalCowSize(totalCowSize);
        breed_frag_arr = new Fragment[]{ breed_poor,breed_water_q1,breed_water_q2,breed_water_q3,
                breed_straw,breed_outward,breed_shade,breed_summer_ventilating,breed_mist_spray,
                breed_wind_block,breed_winter_ventilating,calf_shade,calf_summer_ventilating,calf_mist_spray,
                calf_straw,calf_warm,calf_wind_block,breed_limp,breed_slight_hair_loss,breed_critical_hair_loss,
                breed_cough,breed_runny_nose,breed_ophthalmic,breed_breath,breed_diarrhea,breed_ruminant,breed_fall_dead,
                breed_horn_q1,breed_horn_q2,breed_horn_q3,breed_castration_q1,breed_castration_q2,breed_castration_q3,
                breed_struggle,breed_harmony,breed_avoid_distance};

        freestall_frag_arr = new Fragment[]{ freestall_poor,freestall_water_q1,freestall_water_q2,freestall_water_q3,
                freestall_count,freestall_sit_collision,freestall_area_out_collision,freestall_sit_time,freestall_appearance_q1,freestall_appearance_q2,freestall_appearance_q3,freestall_shade,freestall_summer_ventilating,freestall_mist_spray,
                freestall_wind_block,freestall_winter_ventilating,freestall_calf_shade,freestall_calf_summer_ventilating,freestall_calf_mist_spray,
                freestall_calf_straw,freestall_calf_warm,freestall_calf_wind_block,freestall_slight_limp,freestall_critical_limp,freestall_slight_hairloss,freestall_critical_hairloss,
                breed_cough,freestall_runnynose,freestall_ophthalmic,
                freestall_respiratory,freestall_diarrhea,freestall_outgenitals,freestall_breast,freestall_falldead,freestall_dystocia,freestall_astasia,freestall_horn_q1,freestall_horn_q2,freestall_horn_q3,freestall_struggle,
                freestall_avoid_distance}; // 6,7,8,9,10,11 추가하기



        transaction = fragmentManager.beginTransaction();

        // 목록 버튼 누르면 왼쪽에서 나오는 드로우 나타내기 및 없애기 & 체크 이미지 바꾸기
        list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(farmType == 2) {
                    drawerHandler();
                    changeCheckImageFunc();
                }
                else if(farmType == 5) {
                    drawerHandler();
                    changeCheckImageFuncFreestall();
                }
            }
        });
        list_menu_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(farmType == 2) {
                    View view = findViewById(R.id.list_sub_menu_1);
                    listMenuBtnHandler(list_menu_btn_1,view);
                }
                else if(farmType == 5) {
                    View view = findViewById(R.id.freestall_list_sub_menu_1);
                    listMenuBtnHandler(list_menu_btn_1,view);
                }
            }
        });
        list_menu_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(farmType == 2) {
                    View view = findViewById(R.id.list_sub_menu_2);
                    listMenuBtnHandler(list_menu_btn_2,view);
                }
                else if(farmType == 5) {
                    View view = findViewById(R.id.freestall_list_sub_menu_2);
                    listMenuBtnHandler(list_menu_btn_2,view);
                }
            }
        });
        list_menu_btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(farmType == 2) {
                    View view = findViewById(R.id.list_sub_menu_3);
                    listMenuBtnHandler(list_menu_btn_3,view);
                }
                else if(farmType == 5) {
                    View view = findViewById(R.id.freestall_list_sub_menu_3);
                    listMenuBtnHandler(list_menu_btn_3,view);
                }
            }
        });
        list_menu_btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(farmType == 2) {
                    View view = findViewById(R.id.list_sub_menu_4);
                    listMenuBtnHandler(list_menu_btn_4,view);
                }
                else if(farmType == 5) {
                    View view = findViewById(R.id.freestall_list_sub_menu_4);
                    listMenuBtnHandler(list_menu_btn_4,view);
                }
            }
        });

        transaction = fragmentManager.beginTransaction();

        if (farmType == 1) {

        }
        else if (farmType == 2 || farmType == 3) {
            transaction.replace(R.id.fragment_paper, breed_poor).commitAllowingStateLoss();
            total_page.setText(String.valueOf(" / " + breed_frag_arr.length));
            ImageButton breed_list_btn_1 = findViewById(R.id.question_list_btn_1);
            ImageButton breed_list_btn_2 = findViewById(R.id.question_list_btn_2);
            ImageButton breed_list_btn_3 = findViewById(R.id.question_list_btn_3);
            ImageButton breed_list_btn_4 = findViewById(R.id.question_list_btn_4);
            ImageButton breed_list_btn_5 = findViewById(R.id.question_list_btn_5);
            ImageButton breed_list_btn_6 = findViewById(R.id.question_list_btn_6);
            ImageButton breed_list_btn_7 = findViewById(R.id.question_list_btn_7);
            ImageButton breed_list_btn_8 = findViewById(R.id.question_list_btn_8);
            ImageButton breed_list_btn_9 = findViewById(R.id.question_list_btn_9);
            ImageButton breed_list_btn_10 = findViewById(R.id.question_list_btn_10);
            ImageButton breed_list_btn_11 = findViewById(R.id.question_list_btn_11);
            ImageButton breed_list_btn_12 = findViewById(R.id.question_list_btn_12);
            ImageButton breed_list_btn_13 = findViewById(R.id.question_list_btn_13);
            ImageButton breed_list_btn_14 = findViewById(R.id.question_list_btn_14);
            ImageButton breed_list_btn_15 = findViewById(R.id.question_list_btn_15);
            ImageButton breed_list_btn_16 = findViewById(R.id.question_list_btn_16);
            ImageButton breed_list_btn_17 = findViewById(R.id.question_list_btn_17);
            ImageButton breed_list_btn_18 = findViewById(R.id.question_list_btn_18);
            ImageButton breed_list_btn_19 = findViewById(R.id.question_list_btn_19);
            ImageButton breed_list_btn_20 = findViewById(R.id.question_list_btn_20);
            ImageButton breed_list_btn_21 = findViewById(R.id.question_list_btn_21);
            ImageButton breed_list_btn_22 = findViewById(R.id.question_list_btn_22);
            ImageButton breed_list_btn_23 = findViewById(R.id.question_list_btn_23);
            ImageButton breed_list_btn_24 = findViewById(R.id.question_list_btn_24);
            ImageButton breed_list_btn_25 = findViewById(R.id.question_list_btn_25);
            ImageButton breed_list_btn_26 = findViewById(R.id.question_list_btn_26);
            ImageButton breed_list_btn_27 = findViewById(R.id.question_list_btn_27);
            ImageButton breed_list_btn_28 = findViewById(R.id.question_list_btn_28);
            ImageButton breed_list_btn_29 = findViewById(R.id.question_list_btn_29);
            ImageButton breed_list_btn_30 = findViewById(R.id.question_list_btn_30);
            ImageButton breed_list_btn_31 = findViewById(R.id.question_list_btn_31);
            ImageButton breed_list_btn_32 = findViewById(R.id.question_list_btn_32);
            ImageButton breed_list_btn_33 = findViewById(R.id.question_list_btn_33);
            ImageButton breed_list_btn_34 = findViewById(R.id.question_list_btn_34);
            ImageButton breed_list_btn_35 = findViewById(R.id.question_list_btn_35);
            ImageButton breed_list_btn_36 = findViewById(R.id.question_list_btn_36);

            ImageButton[] breed_list_btn_arr = {
                    breed_list_btn_1,breed_list_btn_2,breed_list_btn_3,breed_list_btn_4,breed_list_btn_5,
                    breed_list_btn_6,breed_list_btn_7,breed_list_btn_8,breed_list_btn_9,breed_list_btn_10,
                    breed_list_btn_11,breed_list_btn_12,breed_list_btn_13,breed_list_btn_14,breed_list_btn_15,
                    breed_list_btn_16,breed_list_btn_17,breed_list_btn_18,breed_list_btn_19,breed_list_btn_20,
                    breed_list_btn_21,breed_list_btn_22,breed_list_btn_23,breed_list_btn_24,breed_list_btn_25,
                    breed_list_btn_26,breed_list_btn_27,breed_list_btn_28,breed_list_btn_29,breed_list_btn_30,
                    breed_list_btn_31,breed_list_btn_32,breed_list_btn_33,breed_list_btn_34,breed_list_btn_35,
                    breed_list_btn_36};
            count = listBtnHandler(breed_list_btn_arr,breed_frag_arr);
        }
        else if (farmType == 4) {

        }
        else if (farmType == 5) {
            transaction.replace(R.id.fragment_paper, freestall_poor).commitAllowingStateLoss();
            total_page.setText(String.valueOf(" / " + freestall_frag_arr.length));
//            ImageButton freestall_list_btn_1 = findViewById(R.id.freestall_question_list_btn_1);
//            ImageButton freestall_list_btn_2 = findViewById(R.id.freestall_question_list_btn_2);
//            ImageButton freestall_list_btn_3 = findViewById(R.id.freestall_question_list_btn_3);
//            ImageButton freestall_list_btn_4 = findViewById(R.id.freestall_question_list_btn_4);
//            ImageButton freestall_list_btn_5 = findViewById(R.id.freestall_question_list_btn_5);
//            ImageButton freestall_list_btn_6 = findViewById(R.id.freestall_question_list_btn_6);
//            ImageButton freestall_list_btn_7 = findViewById(R.id.freestall_question_list_btn_7);
//            ImageButton freestall_list_btn_8 = findViewById(R.id.freestall_question_list_btn_8);
//            ImageButton freestall_list_btn_9 = findViewById(R.id.freestall_question_list_btn_9);
//            ImageButton freestall_list_btn_10 = findViewById(R.id.freestall_question_list_btn_10);
//            ImageButton freestall_list_btn_11 = findViewById(R.id.freestall_question_list_btn_11);
//            ImageButton freestall_list_btn_12 = findViewById(R.id.freestall_question_list_btn_12);
//            ImageButton freestall_list_btn_13 = findViewById(R.id.freestall_question_list_btn_13);
//            ImageButton freestall_list_btn_14 = findViewById(R.id.freestall_question_list_btn_14);
//            ImageButton freestall_list_btn_15 = findViewById(R.id.freestall_question_list_btn_15);
//            ImageButton freestall_list_btn_16 = findViewById(R.id.freestall_question_list_btn_16);
//            ImageButton freestall_list_btn_17 = findViewById(R.id.freestall_question_list_btn_17);
//            ImageButton freestall_list_btn_18 = findViewById(R.id.freestall_question_list_btn_18);
//            ImageButton freestall_list_btn_19 = findViewById(R.id.freestall_question_list_btn_19);
//            ImageButton freestall_list_btn_20 = findViewById(R.id.freestall_question_list_btn_20);
//            ImageButton freestall_list_btn_21 = findViewById(R.id.freestall_question_list_btn_21);
//            ImageButton freestall_list_btn_22 = findViewById(R.id.freestall_question_list_btn_22);
//            ImageButton freestall_list_btn_23 = findViewById(R.id.freestall_question_list_btn_23);
//            ImageButton freestall_list_btn_24 = findViewById(R.id.freestall_question_list_btn_24);
//            ImageButton freestall_list_btn_25 = findViewById(R.id.freestall_question_list_btn_25);
//            ImageButton freestall_list_btn_26 = findViewById(R.id.freestall_question_list_btn_26);
//            ImageButton freestall_list_btn_27 = findViewById(R.id.freestall_question_list_btn_27);
//            ImageButton freestall_list_btn_28 = findViewById(R.id.freestall_question_list_btn_28);
//            ImageButton freestall_list_btn_29 = findViewById(R.id.freestall_question_list_btn_29);
//            ImageButton freestall_list_btn_30 = findViewById(R.id.freestall_question_list_btn_30);
//            ImageButton freestall_list_btn_31 = findViewById(R.id.freestall_question_list_btn_31);
//            ImageButton freestall_list_btn_32 = findViewById(R.id.freestall_question_list_btn_32);
//            ImageButton freestall_list_btn_33 = findViewById(R.id.freestall_question_list_btn_33);
//            ImageButton freestall_list_btn_34 = findViewById(R.id.freestall_question_list_btn_34);
//            ImageButton freestall_list_btn_35 = findViewById(R.id.freestall_question_list_btn_35);
//            ImageButton freestall_list_btn_36 = findViewById(R.id.freestall_question_list_btn_36);
//            ImageButton freestall_list_btn_37 = findViewById(R.id.freestall_question_list_btn_37);
//            ImageButton freestall_list_btn_38 = findViewById(R.id.freestall_question_list_btn_38);
//            ImageButton freestall_list_btn_39 = findViewById(R.id.freestall_question_list_btn_39);
//            ImageButton freestall_list_btn_40 = findViewById(R.id.freestall_question_list_btn_40);
//            ImageButton freestall_list_btn_41 = findViewById(R.id.freestall_question_list_btn_41);
//            ImageButton[] freestall_list_btn_arr = {
//                    freestall_list_btn_1,freestall_list_btn_2,freestall_list_btn_3,freestall_list_btn_4,freestall_list_btn_5,
//                    freestall_list_btn_6,freestall_list_btn_7,freestall_list_btn_8,freestall_list_btn_9,freestall_list_btn_10,
//                    freestall_list_btn_11,freestall_list_btn_12,freestall_list_btn_13,freestall_list_btn_14,freestall_list_btn_15,
//                    freestall_list_btn_16,freestall_list_btn_17,freestall_list_btn_18,freestall_list_btn_19,freestall_list_btn_20,
//                    freestall_list_btn_21,freestall_list_btn_22,freestall_list_btn_23,freestall_list_btn_24,freestall_list_btn_25,
//                    freestall_list_btn_26,freestall_list_btn_27,freestall_list_btn_28,freestall_list_btn_29,freestall_list_btn_30,
//                    freestall_list_btn_31,freestall_list_btn_32,freestall_list_btn_33,freestall_list_btn_34,freestall_list_btn_35,
//                    freestall_list_btn_36,freestall_list_btn_37,freestall_list_btn_38,freestall_list_btn_39,freestall_list_btn_40,freestall_list_btn_41};
//            count = listBtnHandler(freestall_list_btn_arr,freestall_frag_arr);
        }
    }
    public void clickHandler(View view)
    {
        transaction = fragmentManager.beginTransaction();
        if(count == 0){
            prev_btn.setVisibility(View.INVISIBLE);
        }

        switch(view.getId())
        {
            // 다음 버튼 누를 시 이어질 페이지 지정
            case R.id.next_btn:
                if (farmType == 1) {

                }
                else if (farmType == 2 || farmType == 3) {
                    nextBtnHandler(count,breed_frag_arr.length);
                    transaction.replace(R.id.fragment_paper,breed_frag_arr[++count]).commitAllowingStateLoss();

                }
                else if (farmType == 4) {

                }
                else if (farmType == 5) {
                    nextBtnHandler(count,freestall_frag_arr.length);
                    transaction.replace(R.id.fragment_paper,freestall_frag_arr[++count]).commitAllowingStateLoss();
                }
                current_page.setText(String.valueOf(count+1));

                break;
            // 이전 버튼 누를 시 이어질 페이지 지정
            case R.id.previous_btn:
                if (farmType == 1) {

                }
                else if (farmType == 2 || farmType == 3) {
                    prevBtnHandler(count,breed_frag_arr.length);
                    transaction.replace(R.id.fragment_paper, breed_frag_arr[--count]).commitAllowingStateLoss();
                }
                else if (farmType == 4) {
                }

                else if (farmType == 5) {
                    prevBtnHandler(count,freestall_frag_arr.length);
                    transaction.replace(R.id.fragment_paper, freestall_frag_arr[--count]).commitAllowingStateLoss();
                }
                current_page.setText(String.valueOf(count+1));
                break;
            case R.id.back_btn:
                myOnBackPressed(myAlertBuilder);
                break;
            case R.id.end_btn:
                fragment_paper.setVisibility(View.GONE);
                end_btn.setVisibility(View.GONE);
                question_top_nav.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction().add(R.id.container, result_total).commit();
                tabs = findViewById(R.id.tab_layout);
                tabs.addTab(tabs.newTab().setText("종합"));
                tabs.addTab(tabs.newTab().setText("사료"));
                tabs.addTab(tabs.newTab().setText("환경"));
                tabs.addTab(tabs.newTab().setText("건강"));
                tabs.addTab(tabs.newTab().setText("행동"));

                tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        int position = tab.getPosition();
                        Fragment selected = null;
                        if(position == 0)
                            selected = result_total;
                        else if(position == 1)
                            selected = result1;
                        else if(position == 2)
                            selected = result2;
                        else if(position == 3)
                            selected = result3;
                        else if(position == 4)
                            selected = result4;
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });
                break;

        }
    }

    private int listBtnHandler(ImageButton[] btnArr,Fragment[] fragments){
        for(int i = 0 ; i < btnArr.length ; i++){
            int finalI = i;
            btnArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    count = finalI;
                    if(count == 0){
                        prev_btn.setVisibility(View.INVISIBLE);
                        next_btn.setVisibility(View.VISIBLE);
                        end_btn.setVisibility(View.GONE);
                    } else if(count == btnArr.length-1) {
                        end_btn.setVisibility(View.VISIBLE);
                        next_btn.setVisibility(View.INVISIBLE);
                        prev_btn.setVisibility(View.VISIBLE);
                    } else{
                        next_btn.setVisibility(View.VISIBLE);
                        prev_btn.setVisibility(View.VISIBLE);
                        end_btn.setVisibility(View.GONE);
                    }
                    current_page.setText(String.valueOf(count+1));
                    closeDrawer();
                    transaction.replace(R.id.fragment_paper,fragments[count]).commitAllowingStateLoss();
                }
            });
        }
        return count;
    }
    private void nextBtnHandler(int count, int totalPageLength){
        if(count + 2 == totalPageLength){
            next_btn.setVisibility(View.INVISIBLE);
            end_btn.setVisibility(View.VISIBLE);
        }
        prev_btn.setVisibility(View.VISIBLE);
        closeDrawer();
    }
    private void prevBtnHandler(int count, int totalPageLength){
        if(count + 1 == totalPageLength){
            next_btn.setVisibility(View.VISIBLE);
        }
        if(count == 1){
            prev_btn.setVisibility(View.INVISIBLE);
        }
        end_btn.setVisibility(View.GONE);
        closeDrawer();

    }
    private void drawerHandler(){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        if(!drawer.isDrawerOpen(Gravity.LEFT)){
            drawer.openDrawer(Gravity.LEFT);
            list_btn.setImageResource(R.drawable.outline_menu_open_24);
        } else if(drawer.isDrawerOpen(Gravity.LEFT)){
            drawer.closeDrawer(Gravity.LEFT);
            list_btn.setImageResource(R.drawable.outline_reorder_24);
        }
    }
    private void closeDrawer(){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(Gravity.LEFT);
        list_btn.setImageResource(R.drawable.outline_reorder_24);
    }

    private void changeCheckImageFunc (){
        ImageView check_total_1 = findViewById(R.id.check_total_1);
        ImageView check_total_2 = findViewById(R.id.check_total_2);
        ImageView check_total_3 = findViewById(R.id.check_total_3);
        ImageView check_total_4 = findViewById(R.id.check_total_4);
        ImageView check_sub_1 = findViewById(R.id.check_sub_1);
        ImageView check_sub_2 = findViewById(R.id.check_sub_2);
        ImageView check_sub_3 = findViewById(R.id.check_sub_3);
        ImageView check_sub_4 = findViewById(R.id.check_sub_4);
        ImageView check_sub_5 = findViewById(R.id.check_sub_5);
        ImageView check_sub_6 = findViewById(R.id.check_sub_6);
        ImageView check_sub_7 = findViewById(R.id.check_sub_7);
        ImageView check_sub_8 = findViewById(R.id.check_sub_8);
        ImageView check_sub_9 = findViewById(R.id.check_sub_9);
        ImageView check_sub_10 = findViewById(R.id.check_sub_10);
        ImageView check_sub_11 = findViewById(R.id.check_sub_11);
        ImageView check_sub_12 = findViewById(R.id.check_sub_12);
        ImageView check_sub_13 = findViewById(R.id.check_sub_13);
        ImageView check_sub_14 = findViewById(R.id.check_sub_14);
        ImageView check_sub_15 = findViewById(R.id.check_sub_15);
        ImageView check_sub_16 = findViewById(R.id.check_sub_16);
        ImageView check_sub_17 = findViewById(R.id.check_sub_17);
        ImageView check_sub_18 = findViewById(R.id.check_sub_18);
        ImageView check_sub_19 = findViewById(R.id.check_sub_19);
        ImageView check_sub_20 = findViewById(R.id.check_sub_20);
        ImageView check_sub_21 = findViewById(R.id.check_sub_21);
        ImageView check_sub_22 = findViewById(R.id.check_sub_22);
        ImageView check_sub_23 = findViewById(R.id.check_sub_23);
        ImageView check_sub_24 = findViewById(R.id.check_sub_24);
        ImageView check_sub_25 = findViewById(R.id.check_sub_25);
        ImageView check_sub_26 = findViewById(R.id.check_sub_26);
        ImageView check_sub_27 = findViewById(R.id.check_sub_27);
        ImageView check_sub_28 = findViewById(R.id.check_sub_28);
        ImageView check_sub_29 = findViewById(R.id.check_sub_29);
        ImageView check_sub_30 = findViewById(R.id.check_sub_30);
        ImageView check_sub_31 = findViewById(R.id.check_sub_31);
        ImageView check_sub_32 = findViewById(R.id.check_sub_32);
        ImageView check_sub_33 = findViewById(R.id.check_sub_33);
        ImageView check_sub_34 = findViewById(R.id.check_sub_34);
        ImageView check_sub_35 = findViewById(R.id.check_sub_35);
        ImageView check_sub_36 = findViewById(R.id.check_sub_36);


        // 프로토콜 1
        changeEditTextCheckImage(check_sub_1,viewModel.getPoorScore());
        if(viewModel.getWaterTankNum() != -1) changeCheckImage(check_sub_2);
        if(viewModel.getWaterTankClean() != -1) changeCheckImage(check_sub_3);
        if(viewModel.getWaterDrink() != -1) changeCheckImage(check_sub_4);
        if(viewModel.getProtocolOneScore() != -1)changeCheckImage(check_total_1);

        // 프로토콜 2
        if(viewModel.getStrawScore() != -1) changeCheckImage(check_sub_5);
        if(viewModel.getOutWardScore() != -1) changeCheckImage(check_sub_6);
        if(viewModel.getShadeScore() != -1) changeCheckImage(check_sub_7);
        if(viewModel.getSummerVentilatingScore() != -1) changeCheckImage(check_sub_8);
        if(viewModel.getMistSprayScore() != -1) changeCheckImage(check_sub_9);
        if(viewModel.getWindBlockScore() != -1) changeCheckImage(check_sub_10);
        if(viewModel.getWinterVentilatingScore() != -1) changeCheckImage(check_sub_11);
        if(viewModel.getCalfShadeScore() != -1) changeCheckImage(check_sub_12);
        if(viewModel.getCalfSummerVentilatingScore() != -1) changeCheckImage(check_sub_13);
        if(viewModel.getCalfMistSprayScore() != -1) changeCheckImage(check_sub_14);
        if(viewModel.getCalfStrawScore() != -1) changeCheckImage(check_sub_15);
        if(viewModel.getCalfWarmScore() != -1) changeCheckImage(check_sub_16);
        if(viewModel.getCalfWindBlockScore() != -1) changeCheckImage(check_sub_17);
        if(viewModel.getProtocolTwoScore() != -1) changeCheckImage(check_total_2);

        //프로토콜 3
        if(viewModel.getLimpScore() != -1) changeCheckImage(check_sub_18);
        changeEditTextCheckImage(check_sub_19,(int)viewModel.getSlightHairLoss());
        changeEditTextCheckImage(check_sub_20,(int)viewModel.getCriticalHairLoss());
        if(viewModel.getCough() != -1) changeCheckImage(check_sub_21);
        changeEditTextCheckImage(check_sub_22,(int)viewModel.getRunnyNoseRatio());
        changeEditTextCheckImage(check_sub_23,(int)viewModel.getOphthalmicRatio());
        changeEditTextCheckImage(check_sub_24,(int)viewModel.getBreathRatio());
        changeEditTextCheckImage(check_sub_25,(int)viewModel.getDiarrheaRatio());
        changeEditTextCheckImage(check_sub_26,(int)viewModel.getRuminantRatio());
        changeEditTextCheckImage(check_sub_27,(int)viewModel.getFallDeadRatio());
        if(viewModel.getHornRemoval() != -1) changeCheckImage(check_sub_28);
        if(viewModel.getAnesthesia() != -1) changeCheckImage(check_sub_29);
        if(viewModel.getPainkiller() != -1) changeCheckImage(check_sub_30);
        if(viewModel.getCastration() != -1) changeCheckImage(check_sub_31);
        if(viewModel.getCastrationAnesthesia() != -1) changeCheckImage(check_sub_32);
        if(viewModel.getCastrationPainkiller() != -1) changeCheckImage(check_sub_33);
        if(viewModel.getProtocolThreeScore() != -1) changeCheckImage(check_total_3);


        //프로토콜 4
        if(viewModel.getStruggle() != -1) changeCheckImage(check_sub_34);
        if(viewModel.getHarmony() != -1)changeCheckImage(check_sub_35);
        if(viewModel.getAvoidDistanceScore() != -1) changeCheckImage(check_sub_36);
        if(viewModel.getProtocolFourScore() != -1)changeCheckImage(check_total_4);
    }
    private void changeCheckImageFuncFreestall (){
        ImageView check_total_1 = findViewById(R.id.check_total_1);
        ImageView check_total_2 = findViewById(R.id.check_total_2);
        ImageView check_total_3 = findViewById(R.id.check_total_3);
        ImageView check_total_4 = findViewById(R.id.check_total_4);
        ImageView check_sub_1 = findViewById(R.id.freestall_check_sub_1);
        ImageView check_sub_2 = findViewById(R.id.freestall_check_sub_2);
        ImageView check_sub_3 = findViewById(R.id.freestall_check_sub_3);
        ImageView check_sub_4 = findViewById(R.id.freestall_check_sub_4);
        ImageView check_sub_5 = findViewById(R.id.freestall_check_sub_5);
        ImageView check_sub_6 = findViewById(R.id.freestall_check_sub_6);
        ImageView check_sub_7 = findViewById(R.id.freestall_check_sub_7);
        ImageView check_sub_8 = findViewById(R.id.freestall_check_sub_8);
        ImageView check_sub_9 = findViewById(R.id.freestall_check_sub_9);
        ImageView check_sub_10 = findViewById(R.id.freestall_check_sub_10);
        ImageView check_sub_11 = findViewById(R.id.freestall_check_sub_11);
        ImageView check_sub_12 = findViewById(R.id.freestall_check_sub_12);
        ImageView check_sub_13 = findViewById(R.id.freestall_check_sub_13);
        ImageView check_sub_14 = findViewById(R.id.freestall_check_sub_14);
        ImageView check_sub_15 = findViewById(R.id.freestall_check_sub_15);
        ImageView check_sub_16 = findViewById(R.id.freestall_check_sub_16);
        ImageView check_sub_17 = findViewById(R.id.freestall_check_sub_17);
        ImageView check_sub_18 = findViewById(R.id.freestall_check_sub_18);
        ImageView check_sub_19 = findViewById(R.id.freestall_check_sub_19);
        ImageView check_sub_20 = findViewById(R.id.freestall_check_sub_20);
        ImageView check_sub_21 = findViewById(R.id.freestall_check_sub_21);
        ImageView check_sub_22 = findViewById(R.id.freestall_check_sub_22);
        ImageView check_sub_23 = findViewById(R.id.freestall_check_sub_23);
        ImageView check_sub_24 = findViewById(R.id.freestall_check_sub_24);
        ImageView check_sub_25 = findViewById(R.id.freestall_check_sub_25);
        ImageView check_sub_26 = findViewById(R.id.freestall_check_sub_26);
        ImageView check_sub_27 = findViewById(R.id.freestall_check_sub_27);
        ImageView check_sub_28 = findViewById(R.id.freestall_check_sub_28);
        ImageView check_sub_29 = findViewById(R.id.freestall_check_sub_29);
        ImageView check_sub_30 = findViewById(R.id.freestall_check_sub_30);
        ImageView check_sub_31 = findViewById(R.id.freestall_check_sub_31);
        ImageView check_sub_32 = findViewById(R.id.freestall_check_sub_32);
        ImageView check_sub_33 = findViewById(R.id.freestall_check_sub_33);
        ImageView check_sub_34 = findViewById(R.id.freestall_check_sub_34);
        ImageView check_sub_35 = findViewById(R.id.freestall_check_sub_35);
        ImageView check_sub_36 = findViewById(R.id.freestall_check_sub_36);
        ImageView check_sub_37 = findViewById(R.id.freestall_check_sub_37);
        ImageView check_sub_38 = findViewById(R.id.freestall_check_sub_38);
        ImageView check_sub_39 = findViewById(R.id.freestall_check_sub_39);
        ImageView check_sub_40 = findViewById(R.id.freestall_check_sub_40);
        ImageView check_sub_41 = findViewById(R.id.freestall_check_sub_41);


        // 프로토콜 1
        changeEditTextCheckImage(check_sub_1,viewModel.getPoorScore());
        if(viewModel.getWaterTankNum() != -1) changeCheckImage(check_sub_2);
        if(viewModel.getWaterTankClean() != -1) changeCheckImage(check_sub_3);
        if(viewModel.getWaterDrink() != -1) changeCheckImage(check_sub_4);
        if(viewModel.getProtocolOneScore() != -1)changeCheckImage(check_total_1);

        // 프로토콜 2
        //5프리스톨 수
        if(viewModelMilk.getAreaOutCollision() != -1) changeCheckImage(check_sub_7);
        if(viewModelMilk.getAppearanceQ1Score() != -1) changeCheckImage(check_sub_9);
        if(viewModelMilk.getAppearanceQ2Score() != -1) changeCheckImage(check_sub_10);
        if(viewModelMilk.getAppearanceQ3Score() != -1) changeCheckImage(check_sub_11);
        if(viewModel.getShadeScore() != -1) changeCheckImage(check_sub_12);
        if(viewModel.getSummerVentilatingScore() != -1) changeCheckImage(check_sub_13);
        if(viewModel.getMistSprayScore() != -1) changeCheckImage(check_sub_14);
        if(viewModel.getWindBlockScore() != -1) changeCheckImage(check_sub_15);
        if(viewModel.getWinterVentilatingScore() != -1) changeCheckImage(check_sub_16);
        if(viewModel.getCalfShadeScore() != -1) changeCheckImage(check_sub_17);
        if(viewModel.getCalfSummerVentilatingScore() != -1) changeCheckImage(check_sub_18);
        if(viewModel.getCalfMistSprayScore() != -1) changeCheckImage(check_sub_19);
        if(viewModel.getCalfStrawScore() != -1) changeCheckImage(check_sub_20);
        if(viewModel.getCalfWarmScore() != -1) changeCheckImage(check_sub_21);
        if(viewModel.getCalfWindBlockScore() != -1) changeCheckImage(check_sub_22);
        if(viewModel.getProtocolTwoScore() != -1) changeCheckImage(check_total_2);

        //프로토콜 3
        changeEditTextCheckImage(check_sub_23,(int)viewModelMilk.getSlightHairLoss());
        changeEditTextCheckImage(check_sub_24,(int)viewModelMilk.getCriticalHairLoss());
        changeEditTextCheckImage(check_sub_25,(int)viewModelMilk.getSlightHairLoss());
        changeEditTextCheckImage(check_sub_26,(int)viewModelMilk.getCriticalHairLoss());
        if(viewModel.getCough() != -1) changeCheckImage(check_sub_27);
        changeEditTextCheckImage(check_sub_28,(int)viewModelMilk.getRunnyNoseRatio());
        changeEditTextCheckImage(check_sub_29,(int)viewModelMilk.getOphthalmicRatio());
        changeEditTextCheckImage(check_sub_30,(int)viewModelMilk.getRespiratoryRatio());
        changeEditTextCheckImage(check_sub_31,(int)viewModelMilk.getDiarrheaRatio());
        changeEditTextCheckImage(check_sub_32,(int)viewModelMilk.getOutGenitalsRatio());
        changeEditTextCheckImage(check_sub_33,(int)viewModelMilk.getBreastRatio());
        changeEditTextCheckImage(check_sub_34,(int)viewModelMilk.getFallDeadRatio());
        changeEditTextCheckImage(check_sub_35,(int)viewModelMilk.getDystociaRatio());
        changeEditTextCheckImage(check_sub_36,(int)viewModelMilk.getAstasiaRatio());
        if(viewModel.getHornRemoval() != -1) changeCheckImage(check_sub_28);
        if(viewModel.getAnesthesia() != -1) changeCheckImage(check_sub_29);
        if(viewModel.getPainkiller() != -1) changeCheckImage(check_sub_30);
        if(viewModel.getProtocolThreeScore() != -1) changeCheckImage(check_total_3);

        //프로토콜 4
        if(viewModel.getStruggle() != -1) changeCheckImage(check_sub_34);
        if(viewModel.getAvoidDistanceScore() != -1) changeCheckImage(check_sub_36);
        if(viewModel.getProtocolFourScore() != -1)changeCheckImage(check_total_4);
    }

    private void changeEditTextCheckImage(ImageView checkImageView,int questionScore){
        if(questionScore == -1)
            checkImageView.setImageResource(R.drawable.ic_baseline_not_check_circle_24);
        else
            checkImageView.setImageResource(R.drawable.ic_baseline_check_circle_24);
    }
    private void changeCheckImage(ImageView checkImageView){
        checkImageView.setImageResource(R.drawable.ic_baseline_check_circle_24);
    }
    private void listMenuBtnHandler(ImageButton btn,View view)
    {
        if(view.getVisibility() == View.GONE){
            view.setVisibility(View.VISIBLE);
            btn.setImageResource(R.drawable.outline_menu_open_24);
        }else if(view.getVisibility() == View.VISIBLE){
            view.setVisibility(View.GONE);
            btn.setImageResource(R.drawable.outline_reorder_24);
        }
    }


    public void fragmentChange(int index) {
        if(index == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_paper, freestall_water_q1_1).commit();
        }
        else if(index == 2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_paper, freestall_water_q1_2).commit();
        }
    }


    private void myOnBackPressed(AlertDialog.Builder AlertBuilder){

        AlertBuilder.setTitle("이전");
        AlertBuilder.setMessage("지금까지 평가한 항목이 사라집니다.\n" +
                "정보 입력 화면으로 돌아가시겠습니까?");
        // 버튼 추가 (Ok 버튼과 Cancle 버튼 )
        AlertBuilder.setPositiveButton("취소",new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog,int which){
                // OK 버튼을 눌렸을 경우

            }
        });
        AlertBuilder.setNegativeButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertBuilder.show();
    }


}