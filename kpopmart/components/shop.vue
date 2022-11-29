<template>
  <v-app id="shop">
    <div class="bg-shop">
      <v-content>
        <v-container class="fill-height" fluid>
          <v-row align="center" justify="center">
            <v-col col="12" md="9">
              <div class="shop">
                <v-row>
                  <div class="title">
                    <h1 class="white--text font-weight-bold display-1 mt-1">
                      Shop
                    </h1>
                    <p
                      class="
                        white--text
                        font-weight-medium
                        subtitle-1
                        mb-3
                        mr-8
                      "
                    >
                      Top Sellers
                    </p>
                  </div>
                  <!-- <v-spacer></v-spacer> -->
                  <v-btn rounded outlined large dark class="mt-5" to="/store">
                    view more
                    <v-icon class="ml-2">mdi-arrow-right</v-icon>
                  </v-btn>
                </v-row>
              
                <!-- all-card-center -->
                <v-row align="center" justify="center">
                  <!-- card -->
                  <v-col cols="4">
                    <v-row align="center" justify="center">
                      <v-container>
                        <v-col cols="12">
                          <v-card class="mx-auto" max-width="300">
                            <div class="pa-4">
                              <v-img
                                src="/al-3.jpg"
                                :class="
                                  $vuetify.breakpoint.mdAndUp
                                    ? 'rounded-lg'
                                    : 'rounded-0'
                                "
                                height="100%"
                              ></v-img>
                            </div>
                            <div class="d-flex flex-column-reverse flex-md-row">
                              <div>
                                <v-row class="ml-1 ">
                                  <v-card-title>
                                    TREASURE 3rd album
                                    <v-btn icon color="#9293FF" dark rounded>
                                      <v-icon>mdi-cart</v-icon>
                                    </v-btn>
                                    <v-btn icon color="#9293FF" dark rounded>
                                      <v-icon>mdi-heart</v-icon>
                                    </v-btn>
                                  </v-card-title>
                                  <v-card-text> [THE FIRST STEP : CHAPTER THREE] </v-card-text>
                                </v-row>
                                <v-card-actions
                                  class="
                                    dense
                                    ml-1
                                    justify-space-between
                                    d-flex
                                  "
                                >
                                  <v-btn text color="#9293FF" dark>
                                    TREASURE
                                  </v-btn>
                                  <p class="mr-4 font-weight-bold purple--text">
                                    490 ฿
                                  </p>
                                </v-card-actions>
                              </div>
                            </div>
                          </v-card>
                        </v-col>
                      </v-container>
                    </v-row>
                  </v-col>
                  <!-- card -->
                  <v-col cols="4">
                    <v-row align="center" justify="center">
                      <v-container >
                        <v-col cols="12">
                          <v-card class="mx-auto" max-width="300">
                            <div class="pa-4">
                              <v-img
                                src="/al-6.jpg"
                                :class="
                                  $vuetify.breakpoint.mdAndUp
                                    ? 'rounded-lg'
                                    : 'rounded-0'
                                "
                                height="100%"
                              ></v-img>
                            </div>
                            <div class="d-flex flex-column-reverse flex-md-row">
                              <div>
                                <v-row class="ml-1">
                                  <v-card-title>
                                    Rosé First Single
                                    <v-btn icon color="#9293FF" dark rounded>
                                      <v-icon>mdi-cart</v-icon>
                                    </v-btn>
                                    <v-btn icon color="#9293FF" dark rounded>
                                      <v-icon>mdi-heart</v-icon>
                                    </v-btn>
                                  </v-card-title>
                                  <v-card-text> Vinyl LP -R- [Limited Edition] </v-card-text>
                                </v-row>
                                <v-card-actions
                                  class="
                                    dense
                                    ml-1
                                    justify-space-between
                                    d-flex
                                  "
                                >
                                  <v-btn text color="#9293FF" dark>
                                    Rosé
                                  </v-btn>
                                  <p class="mr-4 font-weight-bold purple--text">
                                    1,390 ฿
                                  </p>
                                </v-card-actions>
                              </div>
                            </div>
                          </v-card>
                        </v-col>
                      </v-container>
                    </v-row>
                  </v-col>
                  <!-- card -->
                  <v-col cols="4">
                    <v-row align="center" justify="center">
                      <v-container>
                        <v-col cols="12">
                          <v-card class="mx-auto" max-width="300">
                            <div class="pa-4">
                              <v-img
                                src="/al-5.jpg"
                                :class="
                                  $vuetify.breakpoint.mdAndUp
                                    ? 'rounded-lg'
                                    : 'rounded-0'
                                "
                                height="100%"
                              ></v-img>
                            </div>
                            <div class="d-flex flex-column-reverse flex-md-row">
                              <div>
                                <v-row class="ml-1">
                                  <v-card-title>
                                    WINNER 4th album
                                    <v-btn icon color="#9293FF" dark rounded>
                                      <v-icon>mdi-cart</v-icon>
                                    </v-btn>
                                    <v-btn icon color="#9293FF" dark rounded>
                                      <v-icon>mdi-heart</v-icon>
                                    </v-btn>
                                  </v-card-title>
                                  <v-card-text> [HOLIDAY] (PHOTOBOOK ver.) </v-card-text>
                                </v-row>
                                <v-card-actions
                                  class="
                                    dense
                                    ml-1
                                    justify-space-between
                                    d-flex
                                  "
                                >
                                  <v-btn text color="#9293FF" dark>
                                    WINNER
                                  </v-btn>
                                  <p class="mr-4 font-weight-bold purple--text">
                                    1,200 ฿
                                  </p>
                                </v-card-actions>
                              </div>
                            </div>
                          </v-card>
                        </v-col>
                      </v-container>
                    </v-row>
                  </v-col>
                  <!-- card -->
                </v-row>

                <!-- <v-row align="center" justify="center">
                  <v-col cols="4">
                    <v-row align="center" justify="center">
                      <v-sheet
                        class="mx-auto my-12"
                        max-width="350"
                        dark="true"
                        color="white"
                      >
                        <template slot="progress">
                          <v-progress-linear
                            color="deep-purple"
                            height="10"
                            indeterminate
                          ></v-progress-linear>
                        </template>
                        <v-img height="250" src="/g1.png"></v-img>
                        <v-card-title class="display-0 font-weight-bold mb-4">
                          PUBG MOBILE-RUNIC POWER

                          <v-row align="center" justify="end">
                            <v-btn icon>
                              <v-spacer></v-spacer>
                              <v-icon class=""> mdi-heart </v-icon>
                            </v-btn>
                          </v-row>
                        </v-card-title>
                        <v-card-text>
                          <div class="my-1 text-subtitle-1">Tencent Games</div>
                        </v-card-text>

                        <v-card-actions>
                          <v-btn color="#615F5F" text @click="Action">
                            Action
                          </v-btn>
                          <v-row align="center" justify="end">
                            <div
                              class="
                                mb-1
                                mr-6
                                deep-purple--text
                                font-weight-bold
                              "
                            >
                              6.99$
                            </div>
                          </v-row>
                        </v-card-actions>
                      </v-sheet>
                    </v-row>
                  </v-col>
                </v-row> -->
                <!-- card -->
              </div>
            </v-col>
          </v-row>
        </v-container>
      </v-content>
    </div>
  </v-app>
</template>

<style>
/* .sub {
  position: relative;
  top: 65px;
} */
.bg-shop {
  height: 100vh;
  width: 100vw;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bgkp3.png");
}
</style>
