<template>
  <div class="user-bar ml-2">
    <v-menu
      offset-y
      left
      nudge-bottom="2"
      min-width="250"
      content-class="user-wish-menu-content"
    >
      <template v-slot:activator="{ on, attrs }">
        <v-btn icon >
          <v-icon v-bind="attrs" v-on="on">mdi-heart</v-icon>
        </v-btn>
      </template>
      <!-- header -->
      <v-list>
        <div class="pb-0 pt-0">
          <v-container>
              <v-row justify="center" no-gutters>
                  <v-col >
                      <v-img
                        rounded
                        height="100px"
                        width="110px"
                        src="/al-1.png"
                        class="pd-show"
                    ></v-img>
                  </v-col>
                  <v-col>
                    <div
                        class="d-inline-flex flex-column justify-center ml-2"
                        style="vertical-align:middle"
                    >
                        <span class="font-weight-semibold">
                        LISA 1st
                        </span>
                        <small class="text--disabled text-capitalize">Blackpink</small>
                        <v-row class="justify-space-between" no-gutters>
                            <v-col>
                            <v-btn icon class="ml-6" color="#EF5DA8" dark rounded>
                                <v-icon>mdi-heart</v-icon>
                                <small class="text--disabled text-capitalize"> Wish List</small>
                            </v-btn>
                            </v-col>
                            <v-col>
                            </v-col>
                        </v-row>
                    </div>
                  </v-col>
              </v-row>
          </v-container>
        </div>
        <v-divider class="my-1"></v-divider>
          <v-container>
              <v-row justify="center" no-gutters>
                  <v-col >
                      <v-img
                        rounded
                        height="100px"
                        width="110px"
                        src="/al-2.png"
                        class="pd-show"
                    ></v-img>
                  </v-col>
                  <v-col>
                    <div
                        class="d-inline-flex flex-column justify-center ml-2"
                        style="vertical-align:middle"
                    >
                        <span class="font-weight-semibold">
                        TREASURE 2nd
                        </span>
                        <small class="text--disabled text-capitalize">TREASURE</small>
                        <v-row class="justify-space-between" no-gutters>
                            <v-col>
                            <v-btn icon class="ml-6" color="#EF5DA8" dark rounded>
                                <v-icon>mdi-heart</v-icon>
                                <small class="text--disabled text-capitalize"> Wish List</small>
                            </v-btn>
                            </v-col>
                            <v-col>
                            </v-col>
                        </v-row>
                    </div>
                  </v-col>
              </v-row>
          </v-container>
      </v-list>
    </v-menu>
  </div>
</template>

<style scoped>
.pd-show {
    border-radius: 10px;
}
</style>