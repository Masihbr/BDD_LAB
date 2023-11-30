# تبدیل نیازمندی‌ها به موارد آزمون با استفاده از روش ایجاد مبتنی بر رفتار (BDD)
# روال انجام آزمایش
## سوال 1
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/3844ba88-afaf-422c-89da-580dd26797f6)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/8ab273e0-6149-412b-89f5-bc1cde91552e)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/b384d0a0-c5c8-4bc3-8449-69eb9a336f69)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/634292b2-ef67-491e-ab9d-d603c3acae45)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/64d38fef-fc2b-482c-8fb3-a614e4569e11)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/991ee520-bb87-4bf4-a213-401ca20bf2fb)
**توجه** در این مرحله dependency ها مطابق داک اضافه شد اما بدلیل بروز مشکلات متعدد و ارور های عجیب در ادامه از نسخه‌ی متفاوتی از cucumber استفاده شد.
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/d29cd83b-2dd8-4f46-b89b-bbf906c86d3b)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/1fe0eafa-b0bd-4871-ae76-7b3910667520)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/e36ceeba-f5ec-43fe-bcbb-034a5fe27b57)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/f78d9fe4-6798-4fa3-92b0-e398bc28f47c)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/9a976b83-0c25-48ae-b78a-c9c73752a0d5)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/bfc30bb2-c36a-439b-92ee-7014e0eb5725)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/eec5419d-95b6-4573-b522-f8e25335aa79)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/25234055-c77c-4a7a-82f7-c0e210e0be73)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/45f9ddd3-f7d2-476a-bce2-3308e78ecab0)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/e5068373-db97-45c0-ba42-8c38217b3d58)
**توجه** این فایل در ادامه تغییر خواهد کرد زیراکه پکیج cucumber تغییر می‌کند.
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/d517e49a-ec8f-4240-8070-3ff630d10808)
**توجه** این فایل در ادامه تغییر خواهد کرد زیراکه پکیج cucumber تغییر می‌کند.
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/61f4c37b-7c74-4cd3-803d-2eed37e7fefb)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/588231d3-40dc-4cbb-9acf-651ff0678dc5)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/3241bf90-26ed-4dab-8b17-2dc3e163dd91)
**توجه** در این مرحله با وجود تعریف شده بودن تعاریف سناریو در اجرا با مشکل مواجه هستیم و پس از بررسی ها معلوم شد که ورژن cucumber مطرح شده deprecated شده است و باید از io.cucumber استفاده کنیم.
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/0185d2dc-58d9-406b-911b-bb4e7224ed81)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/1eeca1ec-dd10-451b-a35d-30aec5165e19)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/dc8629ea-c0fc-496c-9da0-8f89b830a83b)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/e595176c-7bda-4df2-9dec-590d6630ab60)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/fb96487c-e5a9-4362-825c-5eee83622871)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/b0e3ca25-4e09-416f-9c2b-11a2336a0482)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/2d7287c1-71d0-400c-9ce8-344e691c415a)
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/560e68cc-74c8-4a8c-9290-12c9ef10437c)
**توجه** پکیج io.cucumber به جای استفاده از رجکس از تگ های {int} استفاده می‌کند و اشکالی برای Scenario Outline ایجاد نمی‌شود.
![image](https://github.com/Masihbr/BDD_LAB/assets/56260232/0d0120a1-d3ad-47a1-990f-d1c8936fc1a3)

## سوال 2
با توجه به توضیحات و عکس‌های بخش قبل به دلیل اینکه از {int} برای پارس کردن سناریو استفاده شده مشکلی ایجاد نمی‌شود. اما در حالت قبلی که از regex استفاده می‌شد. باید به جای `(+d\\)` از `(+d\\?-)` استفاده می‌کردیم تا اگر مشکلی برای عدد منفی که Senario Outline مشخص شده پیش می‌آمد از بین برود. (احتمالا هدف سوال کشف این موضوع بوده است.) با این فرض: <br/>
- این موارد تست کدامند؟ -> تست دارای عدد منفی.
- علت بروز مشکل چیست؟ -> عدد منفی و در نظر گرفته نشدن آن در رجکس اولیه.
- مشکل را با تغییر کد برطرف نمایید. -> رجکس جدید با در نظر گرفتن عدد منفی می‌گذاریم.
- توضیح مربوط به این بخش را باید به صورت یک گزارش کوتاه (در حد چند خط) از علت بروز مشکل و نحوه رفع آن ارائه کنید. -> بالاتر ذکر شده.


# سوال ۳
باتوجه به اینکه تنظیمات مربوط به cucumber و junit در بخش های قبل زده شده بود صرفا از همان برنچ یک شاخه گرفتم و دیپندسی های مربوطه را در maven ایمپورت کردم. در گام بعدی به سراغ طراحی سناریو رفتم. این نکته را حائز اهمیت است که دیگر فیچر جدیدی به پروژه اضافه نکردم و در همان Calculator سناریوهای جدید را اضافه کردم تا راحت تر بتوان تست کلی را انجام داد.
حال به سراغ پیاده سازی سناریوها میرویم. 


![Screenshot from 2023-11-29 16-56-44](https://github.com/Masihbr/BDD_LAB/assets/59168138/51bf9cf8-f422-43e9-8b83-8fab7914b696)

تصویر بالا سناریو خام اولی بود که طراحی کرده بودم و باتوجه به این سناریو دوتا فانشکن (بخش given مشابه سناریوی جمع دو عدد زده شد تا دیگر نیازی به اضافه کردن تابع برای هندل کردن آن نباشد.)
به همان کلاس MyStepdefs اضافه کردیم که به شکل زیر هستند.

![Screenshot from 2023-11-29 17-16-02](https://github.com/Masihbr/BDD_LAB/assets/59168138/0deba885-75d0-4f04-8af9-fda2596c65ce)

در اینجا حتی میتوانستیم تابع سومی را نیز (iExpectTheReturn) با تابع سوم سناریو جمع یکی کنیم که حالا برای اینکه کمی تفکیک قائل شده باشیم دو تابع جدا زدیم. تابع بالایی iCalculateTheSquareRootOfDivideBy هم تابع اصلی است که الگوریتمی که میخواهیم بوسیله آن خروجی تولید کنیم و انرا بسنجیم در این جا فراخوانی میشود.
حال متناسب با این نیاز باید این الگوریتم را نیز در calculator تعریف کنیم.

![Screenshot from 2023-11-29 16-56-54](https://github.com/Masihbr/BDD_LAB/assets/59168138/c464a330-55c3-4382-88c9-1cbe66ededdd)

حال که تعاریف را کامل کردیم سناریو را ران میکنیم اما همانطور که در تصویر اول دیدید این سناریو موفقیت آمیز اجرا نمیشود زیرا ورودی های معتبری ندارد.
![Screenshot from 2023-11-29 17-00-30](https://github.com/Masihbr/BDD_LAB/assets/59168138/ee17e8e6-0a8d-42d8-98aa-ca94dfa4f213)

ورودی های معتبر را میدهیم و تست به درستی پاس میشود.
حال به سراغ طراحی سناریو outline میرویم.
![Screenshot from 2023-11-29 17-04-22](https://github.com/Masihbr/BDD_LAB/assets/59168138/72bad799-ec66-45cd-864d-b13cd4d28e05)

در این سناریو نام متغیرها را باتوجه به داکیمونتی که در اختیارمان قرار گرفته است مشخص میکنیم و example را هم از همان داکیومنت استخراج میکنیم.
از انجایی که از ابتدا هم با رجکس توابع mysteps را پیاده سازی نکرده بودم پس برای outline نیز نیازی به تغییر آنها پیدا نخواهیم داشت.
![Screenshot from 2023-11-29 17-04-49](https://github.com/Masihbr/BDD_LAB/assets/59168138/d6aa4c3c-2238-4a87-8df3-124cedc996c5)
اجرا میکنیم و این سناریوها نیز با موفقیت اجرا میشوند.

# سوال ۴
در این بخش هم نتیجه ران کردن feature و اجرای تمامی سناریو ها با هم را تست میکنیم تا بدرستی کار کنند.
![Screenshot from 2023-11-29 17-16-02](https://github.com/Masihbr/BDD_LAB/assets/59168138/94469e23-b4fc-4dff-84ba-de95004db4c3)









