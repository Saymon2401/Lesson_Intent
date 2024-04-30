package com.example.lesson_48.Fourth

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lesson_48.R
import com.example.lesson_48.databinding.ActivityFourthSecondBinding
import com.example.lesson_48.model.Card

class FourthSecond : AppCompatActivity() {
    lateinit var binding: ActivityFourthSecondBinding

    var mainText = listOf<String>()
    var images: List<Drawable> = listOf()
    var secondText = listOf<String>()

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainText = listOf("Osiyo kubogi U23. O‘zbekiston Indoneziyani mag‘lub etib, o‘z tarixida ilk marta Olimpiadaga yo‘llanma oldi", "G‘azo sektoridagi shifoxona hududidan ommaviy qabrlar topildi", "Amerika universitetlari Isroilga qarshi namoyishlardan larzaga kelmoqda. Fotosuratlar", "18 mamlakat yetakchilari HAMASni garovdagilarni ozod qilishga chaqirdi", "Saudiyadagi sammitda Isroil va Hamas o‘rtasida muzokaralarni tiklashga harakat qilinmoqda")
        images = listOf(getDrawable(R.drawable.img_4), getDrawable(R.drawable.img_1), getDrawable(R.drawable.img_2), getDrawable(R.drawable.img_3), getDrawable(R.drawable.img),) as List<Drawable>
        secondText = listOf(
            "Qatarda o‘tayotgan Osiyo kubogi U23 yarimfinali doirasida O‘zbekiston olimpiya jamoasi Indoneziyani mag‘lub etib, finalga chiqish bilan birga o‘z tarixida ilk bor Olimpiadaga yo‘llanma oldi. Temur Kapadze shogirdlari Parijda o‘tadigan har to‘rt yillikning eng yirik sport musobaqasida ishtirok etishadi. Vakillarimiz finalda 3 may kuni Iroq – Yaponiya o‘yini g‘olibiga qarshi saf tortadi.\n" +
                    "\n" +
                    "Dohada o‘tgan yarimfinal bahsining birinchi bo‘limida vakillarimiz qator imkoniyatlarga ega bo‘lishsa-da, hisob ochilmadi. Ikkinchi bo‘limda Jasurbek Jaloliddinov va Husayn Norchayev zaxiradan maydonga tushirilgach, hujumkorlik oshdi.",
            "Falastinning G‘azo sektori ma’muriyati Xon Yunisdagi «Nosir» tibbiyot majmuasida 392 jasad ko‘milgan qabrlar topilganini ma’lum qildi. Bu haqda The Insider yozdi. \n" +
                    "\n" +
                    "Falastin tomonining ta’kidlashicha, bular isroillik harbiylar tomonidan qatl etilgan va ko‘milganlarning jasadi va bu «Isroil genotsididan dalolat beradi». \n" +
                    "\n" +
                    "O‘z navbatida Isroil Mudofaa armiyasining da’vo qilishicha, jasadlarni falastinliklarning o‘zi ko‘mgan, hozir esa ular qazib olinmoqda. Isroil yanvar-fevral oylarida tarqalgan videolarga ishora qilgan, ularda xuddi shu joyda ommaviy qabr qazilayotgani tasvirlangan. ",
            "Amerika universitetlarida G‘azo sektoridagi urushga qarshi aksiyalar tinmayapti — talabalar kampuslarda palatkalar o‘rnatib, AQShdan Isroil bilan har qanday moliyaviy aloqalardan voz kechish va yarim yildan buyon davom etayotgan harbiy harakatlarni qo‘llashni to‘xtatishni talab qilmoqda. Kolumbiya universiteti namoyishlar markaziga aylandi. O‘tgan haftada oliy ta’lim muassasasi rahbariyati politsiyani chaqirdi, natijada 100 dan ortiq kishi qo‘lga olindi. Keyin vaziyat keskinlashdi — va Yyelda, Ostindagi Texas universitetida, Janubiy Kaliforniya universiteti hamda Boston universitetlarida yana o‘nlab kishilar ushlandi.\n" +
                    "\n" +
                    "22 aprel kuni Kolumbiya universiteti rahbariyati kunduzgi darslar bekor qilingani haqida e’lon berdi. Ikki kun o‘tib masofadan ta’lim imkoniyatini ko‘zda tutuvchi «gibrid» formatdagi mashg‘ulotlar sxemasi yil oxiriga qadar uzaytirildi, bunda bitirish imtihonlari ham onlayn bo‘ladi. Universitetlar kampuslarni yopmoqda, Janubiy Kaliforniyada xavfsizlik nuqtayi nazaridan asosiy bitiruv marosimi bekor qilindi, ammo boshqa universitetlarda namoyishlar davom etmoqda.",
            "AQSh, Germaniya va yana 16 davlat Falastinning HAMAS tashkilotini G‘azo sektorida 200 kundan ortiq garovda ushlab turilganlarni ozod qilishga chaqirdi. Bu haqda 25 aprel, payshanba kuni Oq uy saytida chop etilgan qo‘shma bayonotda aytiladi.\n" +
                    "\n" +
                    "AQSh prezidenti Jo Bayden va Germaniya kansleri Olaf Sholsdan tashqari uni Avstriya, Argentina, Braziliya, Bolgariya, Britaniya, Vengriya, Daniya, Ispaniya, Kanada, Kolumbiya, Polsha, Portugaliya, Ruminiya, Serbiya, Tailand va Fransiya rahbarlari imzoladi.\n" +
                    "\n" +
                    "«Biz G‘azoda 200 kundan ortiq vaqtdan beri HAMAS tomonidan garovda ushlab turilgan barcha shaxslarni zudlik bilan ozod qilishga chaqiramiz. Ular orasida fuqarolarimiz ham bor. G‘azoda garovga olinganlar va xalqaro huquq himoyasida bo‘lgan tinch aholining taqdiri xalqaro miqyosda tashvish uyg‘otmoqda», - deyiladi bayonotda. ",
            "Saudiya Arabistoni yakshanba kuni Isroil va Hamas o‘rtasida davom etayotgan urushning global iqtisodiyotga ta’siri haqida ogohlantirarkan, mintaqaviy «barqarorlik»ka chaqirdi. Ar-Riyodda Jahon iqtisodiy forumining ikki kunlik maxsus yig‘ilishi o‘tkazilmoqda, unda G‘azodagi mojaroni to‘xtatish bo‘yicha muzokaralar olib borayotgan vositachilar ham qatnashmoqda.\n" +
                    "\n" +
                    "Sammit ishtirokchilari orasida AQSh davlat kotibi Entoni Blinken ham bo‘ladi, u arab yetakchilari bilan muzokaralarning navbatdagi raundida ishtirok etish uchun Saudiya Arabistoniga uchgan. Davlat departamenti u mojaro kengayishining oldini olish zarurligiga urg‘u berishini aytgan."

        )
        val card = Card(mainText,images,secondText)
        val cardNum = intent.getIntExtra("cardIndex",0)
        card.img?.forEachIndexed { index, drawable ->
            if (index==cardNum){
                binding.mainTxt.text = card.mainText!![index]
                binding.img.setImageDrawable(card.img!![index])
                binding.secondText.setText(card.text!![index])
            }
        }
        binding.close.setOnClickListener {
            finish()
        }
    }
}