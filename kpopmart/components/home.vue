<template>
  <v-app id="home">
    <div class="bg-main">
      <v-content>
        <v-container class="fill-height" fluid>
          <v-row>
            <v-col>
              <div class="Home">
                <v-row align="center" justify="center">
                  <v-col cols="10">
                    <v-row align="center" justify="center">
                      <v-col cols="12" md="6" xl="8">
                        <h1 class="display-2 font-weight-bold mb-4 black--text">
                          K-POP MART
                        </h1>
                        <h2 class="font-weight-light black--text">
                          welcome to our store website <br />
                          feel free and enjoy to use our website!<br />
                        </h2>
                        <v-btn
                          rounded
                          outlined
                          large
                          class="mt-5"
                          @click="$vuetify.goTo('#about')"
                        >
                          more
                          <v-icon class="ml-2">mdi-arrow-right</v-icon>
                        </v-btn>
                      </v-col>
                      <!-- text position -->
                      <v-col cols="12" md="6" xl="4" class="hidden-sm-and-down">
                      </v-col>
                    </v-row>
                  </v-col>
                </v-row>
              </div>
            </v-col>
          </v-row>
        </v-container>
      </v-content>
    </div>
  </v-app>
</template>

<style>
.Home {
  position: relative;
  top: 200px;
}
.bg-main {
  height: 100%;
  width: 100vw;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bgkp4.png");
}
</style>
