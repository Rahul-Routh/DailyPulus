package com.rahul.dailypulus.articles

import com.rahul.dailypulus.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class ArticlesViewModel(
    private val usedCase: ArticlesUseCase) :BaseViewModel(){

    private val _articlesState : MutableStateFlow<ArticlesState> =
        MutableStateFlow(ArticlesState(isLoading = true))


    val articlesState:StateFlow<ArticlesState>get()  = _articlesState

    /*private val usedCase:ArticlesUsedCase*/

    init {
        /*val httpClient = HttpClient {
            install(ContentNegotiation) {
                json(Json{
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
        }
        
        val service = ArticlesService(httpClient)
        usedCase = ArticlesUsedCase(service)*/
        getArticles()
    }

    private fun getArticles(){
        scope.launch {

            /*delay(1500)
            _articlesState.emit(ArticlesState(error = "Something went wrong"))
            delay(1500)*/


            val fetchedArticles = usedCase.getArticles()

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }

   /* private suspend fun fetchedArticles(): List<Article> = mockArticles

    private val mockArticles = listOf(
        Article("Nifty undertone to stay bullish as long as it holds 23,400'",
            "The market consolidated within a range, with the index stuck between 23,400 and 23,650. The undertone remains bullish as long as the index sustains above the 23,400 support, where aggressive put writing is visible. Surpassing the 23,650 mark will open further room towards the 23,800/24,000 levels",
            "2024-06-20",
            "https://picsum.photos/200/300"),
        Article("Break below 51,000 will dampen sentiment in Nifty Bank",
            "The Bank Nifty Index continued its strong momentum and managed to hold the support at 51,200-51,000. The bullish momentum is likely to continue, and dips should be utilized to buy the index targeting 52,200/52,600. The lower-end support is placed at 51,000, where the highest open interest is built up on the put side. A break below this level will only dampen the bullish sentiment.",
            "2024-06-20",
            "https://upload.wikimedia.org/wikipedia/commons/d/d7/Philippine-stock-market-board.jpg"),
        Article("Emcure Pharmaceuticals gets Sebi nod for IPO, launch likely in July",
            "Maharashtra-based Emcure Pharmaceuticals has received approval from the capital markets regulator Securities and Exchange Board of India (SEBI) to launch its initial public offering. The IPO may be launched in July, according to people familiar with the development.\n" +
                    "\n" +
                    "The IPO comprises a fresh issue of Rs 800 crore worth of equity shares by the company, and an offer-for-sale (OFS) of 1,36,78,839 equity shares by existing shareholders including promoters.\n" +
                    "\n" +
                    "Satish Ramanlal Mehta, and Sunil Rajanikant Mehta are the promoters selling shareholders in the OFS. Namita Vikas Thapar, Pushpa Rajnikant Mehta, Bhavana Satish Mehta, Kamini Sunil Mehta, BC Investments IV, Arunkumar Purshotamlal KhannaI, Berjis Minoo Desai, and Sonali Sanjay Mehta will also be selling shares in the OFS.",
            "2024-06-20",
            "https://images.moneycontrol.com/static-mcnews/2024/06/20240620094510_Sensex_Nifty.jpg?impolicy=website&width=770&height=431"),
        Article("Nifty undertone to stay bullish as long as it holds 23,400'",
            "The market consolidated within a range, with the index stuck between 23,400 and 23,650. The undertone remains bullish as long as the index sustains above the 23,400 support, where aggressive put writing is visible. Surpassing the 23,650 mark will open further room towards the 23,800/24,000 levels",
            "2024-06-20",
            "https://picsum.photos/200/300"),
        Article("Break below 51,000 will dampen sentiment in Nifty Bank",
            "The Bank Nifty Index continued its strong momentum and managed to hold the support at 51,200-51,000. The bullish momentum is likely to continue, and dips should be utilized to buy the index targeting 52,200/52,600. The lower-end support is placed at 51,000, where the highest open interest is built up on the put side. A break below this level will only dampen the bullish sentiment.",
            "2024-06-20",
            "https://upload.wikimedia.org/wikipedia/commons/d/d7/Philippine-stock-market-board.jpg"),
        Article("Emcure Pharmaceuticals gets Sebi nod for IPO, launch likely in July",
            "Maharashtra-based Emcure Pharmaceuticals has received approval from the capital markets regulator Securities and Exchange Board of India (SEBI) to launch its initial public offering. The IPO may be launched in July, according to people familiar with the development The IPO comprises a fresh issue of Rs 800 crore worth of equity shares by the company, and an offer-for-sale (OFS) of 1,36,78,839 equity shares by existing shareholders including promoters. Satish Ramanlal Mehta, and Sunil Rajanikant Mehta are the promoters selling shareholders in the OFS. Namita Vikas Thapar, Pushpa Rajnikant Mehta, Bhavana Satish Mehta, Kamini Sunil Mehta, BC Investments IV, Arunkumar Purshotamlal KhannaI, Berjis Minoo Desai, and Sonali Sanjay Mehta will also be selling shares in the OFS",
            "2024-06-20",
            "https://upload.wikimedia.org/wikipedia/commons/d/d7/Philippine-stock-market-board.jpg")
    )*/

}