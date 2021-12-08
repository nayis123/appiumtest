Specification Heading
=====================

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run
	gauge specs


Ozdilekteyim Test
--------------------

* "5" saniye bekle
* check "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" id
* "com.ozdilek.ozdilekteyim:id/tv_startShoppingStore" id'li elemente tıkla
* "2" saniye bekle
* check "com.ozdilek.ozdilekteyim:id/iv" id
* "com.ozdilek.ozdilekteyim:id/nav_categories" id'li elemente tıkla
* "2" saniye bekle
* check "com.ozdilek.ozdilekteyim:id/edtSearch" id
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'] [2]" xpath'li elemente tıkla
* "2" saniye bekle
* "//*[@resource-id='com.ozdilek.ozdilekteyim:id/relLayCategoriesItem'] [4]" xpath'li elemente tıkla
* "2" saniye bekle
* Scroll Down
* Scroll Down
* "2" saniye bekle
* random element ekle
* "2" saniye bekle
* check "com.ozdilek.ozdilekteyim:id/iv" id
* "com.ozdilek.ozdilekteyim:id/imgFav" id'li elemente tıkla
* "2" saniye bekle
* check "com.ozdilek.ozdilekteyim:id/etEposta" id
* "com.ozdilek.ozdilekteyim:id/etEposta" id'sine "girismail" textini yaz
* "com.ozdilek.ozdilekteyim:id/etPassword" id'sine "girispassword" textini yaz
* "2" saniye bekle
* "com.ozdilek.ozdilekteyim:id/ivBack" id'li elemente tıkla
* "com.ozdilek.ozdilekteyim:id/ivBack" id'li elemente tıkla
* "2" saniye bekle
* random element ekle
* "2" saniye bekle
* random beden sec
* "2" saniye bekle
* "com.ozdilek.ozdilekteyim:id/relLayAddCartBtn" id'li elemente tıkla
* "4" saniye bekle
