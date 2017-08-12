package com.androidedu.kodluyoruzakademi.androquiz;


class QuestionBank {
    private String textQuestions[] = {
            "1. Dota 2'ye beta aşamasında eklenen ilk kahraman kimdir ?",
            "2. Dota 2 kahramanı Underlord'un ultisinin adı nedir ?",
            "3. Aşağıdaki karakterlerden hangisi Dota 2 çıktığından bu yana isim değiştirmemiştir ?",
            "4. Aşağıdaki kahramanların hangisi, Aghanim'in oğlu olduğunu iddia etmektedir?",
            "5. Skywrath Mage'in aşık olduğu kadın kahraman hangisidir?",
            "6. Centaur Warrunner'ın Stempede'inin üçüncü seviyedeki bekleme süresi nedir ?",
            "7. Hangi eşya güncellenmeden önce Sacred Relic ve Basher ikilisinden oluşuyordu ?",
            "8. Kuryeyi en erken ne zaman uçan kuryeye dönüştürebilirsiniz?",
            "9. Invoker'ın Dota 2'ye gelmeden önce toplam kaç büyüsü vardı ?",
            "10. Pugna aşağıdaki kahramanlardan hangisinin eskiden evcil hayvanı olduğunu iddia eder ?",
    };


    private String multipleChoice[][] = {
            {"Venomancer", "Queen of Pain", "Slardar", "Viper"},
            {"Firestorm", "Dark Rift", "Pit of Malice", "Snowstorm"},
            {"Crystal Maiden", "Necrophos", "Windranger", "Outworld Devourer"},
            {"Treant Protector", "Rubick", "Skywrath Mage", "Brewmaster"},
            {"Luna", "Lina", "Vengeful Spirit", "Crystal Maiden"},
            {"75 Saniye", "45 Saniye", "60 Saniye", "90 Saniye"},
            {"Abyssal Blade", "Butterfly", "Silver Edge", "Octarine Core"},
            {"0:30", "3:30", "0:03", "03:00"},
            {"27", "25", "26", "24"},
            {"Nyx Assassin", "Broodmother", "Venomancer", "Viper"},
    };

    private String mCorrectAnswers[] = {"Venomancer", "Dark Rift", "Crystal Maiden", "Rubick",
            "Vengeful Spirit", "60 Saniye", "Abyssal Blade", "03:00", "27", "Viper"};

    public String getCorrectAnswer(int a) {
        return mCorrectAnswers[a];
    }


    int getLength() {
        return textQuestions.length;
    }


    String getQuestion(int a) {
        return textQuestions[a];
    }


    String getChoice(int index, int num) {
        return multipleChoice[index][num - 1];
    }


}
