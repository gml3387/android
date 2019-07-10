package com.example.urthlesh.ChallengeCreate

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.urthlesh.R
import kotlinx.android.synthetic.main.activity_create_category.*
import kotlinx.android.synthetic.main.activity_create_title.*

class ActivityCreateCategory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_category)

        btn_back_cteate_category.setOnClickListener{
            setResult(Activity.RESULT_OK)
            finish()
        }
        btn_cancel_cteate_category.setOnClickListener {
            setResult(Activity.RESULT_FIRST_USER)
            finish()
        }
        btn_next_cteate_category.setOnClickListener{
            val createnextcontent = Intent(this, ActivityCreateContent::class.java);
            startActivityForResult(createnextcontent, 127)
        }

        img_category1.setOnClickListener {
            img_category1.isSelected=true
            img_category2.isSelected=false
            img_category3.isSelected=false
            img_category4.isSelected=false
            img_category5.isSelected=false
            txt_categorytitle.setText("일회용품")
            txt_categorycontent.setText("육지에는 환경미화원이 있지만, 바닷속에는 청소부가 없습니다. \n 우리나라의 플라스틱 사용률이 세계에서 두 번째로 높다는 사실, 알고 계셨나요? 우리는 하루에도 수십 번씩 플라스틱 제품을 사용하고 쉽게 버리곤 합니다. 버려진 플라스틱은 바다로 흘러들어가 바다거북 수명의 네 배가 넘는 시간 동안 썩지 않고 바다 위를 떠다니게 됩니다. 우리의 아름다운 세 바다가 쓰레기로 넘쳐나지 않게, 변화를 위한 실천이 필요한 때입니다.")

        }
        img_category2.setOnClickListener {
            img_category1.isSelected=false
            img_category2.isSelected=true
            img_category3.isSelected=false
            img_category4.isSelected=false
            img_category5.isSelected=false
            txt_categorytitle.setText("대기")
            txt_categorycontent.setText("지구는 더 더워지고, 숨은 갑갑해집니다.\n 최근 지구 곳곳에서 기온이 50도에 달하는 등 이상 기후가 관찰되고있습니다. 과학자들은 지금처럼 온실가스를 배출하면 지구는 곧 인 간이 살 수 없는 별이 버릴 수도 있다고 말합니다. 우리가 생활하면서 생기는 여러 부산물들은 지구 온도를 높이기도 하지만 공기 중을 떠 다니며 대기를 오염시키기도 합니다. 온실가스와 먼지에 뒤덮인 지 구를 깨끗이 닦아보아요!")
        }
        img_category3.setOnClickListener {
            img_category1.isSelected=false
            img_category2.isSelected=false
            img_category3.isSelected=true
            img_category4.isSelected=false
            img_category5.isSelected=false
            txt_categorytitle.setText("자원")
            txt_categorycontent.setText("8천 년 전만 해도 지구 면적의 거의 절반을 차지했던 숲,\n현재 그중 무려 4/5가 파괴되어 자취를 감췄습니다. 산림파괴의 원인은 다양하지만, 모두 인간의 행동이라는 공통점이 있습니다. 우리나라 사람들이 하루에 종이 한 장을 덜 쓴다면 총 4,800그루의 나무를 살릴 수 있습니다. 지속 가능한 자원 소비와 생활을 위해 또 어떤 실천을 할 수 있을까요?")
        }
        img_category4.setOnClickListener {
            img_category1.isSelected=false
            img_category2.isSelected=false
            img_category3.isSelected=false
            img_category4.isSelected=true
            img_category5.isSelected=false
            txt_categorytitle.setText("수질")
            txt_categorycontent.setText("대한민국은 가뭄과 전쟁 중 \n 우리나라는 전체 수자원 총량의 26%만 이용 가능한 물 스트레스 국가입니다. 몇십 년 전까지만 해도 물을 직접 사 먹어야 한다는 건 상상도 못 할 일이었지만 이제는 현실이 되었습니다. 샤워 시간을 2분만 줄여도 24L의 물을 절약할 수 있습니다. 생활습관의 작은 변화로 물 절약을 시작해보세요.")
        }
        img_category5.setOnClickListener {
            img_category1.isSelected=false
            img_category2.isSelected=false
            img_category3.isSelected=false
            img_category4.isSelected=false
            img_category5.isSelected=true
            txt_categorytitle.setText("생태계")
            txt_categorycontent.setText("지구는 우리의 것이 아닙니다.\n 지금 우리가 발을 딛고 있는 이곳, 지구에는 우리와 같은 인간뿐만 아니라 약 1,500만 종의 동식물이 함께 살고 있습니다. 하지만 그중 많은 종이 자연의 원리가 아닌 인간의 개입 멸종될 위기에 처해있습니다. 이제 우리는 동물을 착취의 대상이 아닌 공생의 대상으로 여겨야 합니다. 다채로운 만큼 아름다운 지구를 위해 비인간 동물의 권리 지키기에 함께해주세요!")
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 127){
            if(resultCode == Activity.RESULT_FIRST_USER){
                finish()
            }
        }
    }
}
