<template>
  <div class="user-bar ml-2">
    <v-menu
      offset-y
      left
      nudge-bottom="2"
      min-width="250"
      content-class="user-wish-menu-content">
      <template v-slot:activator="{ on, attrs }">
        <v-btn icon >
          <!-- <v-badge color="pink" :content="carts.length > 0 ? carts.length : '0'"> -->
          <v-badge color="pink" content="1">
            <v-icon v-bind="attrs" v-on="on">mdi-cart</v-icon>
          </v-badge>
        </v-btn>
      </template>

      <v-list>
        <div class="pb-0 pt-0">
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
                        style="vertical-align:middle">
                        <span class="font-weight-semibold">
                        TREASURE 2nd
                        </span>
                        <small class="text--disabled text-capitalize">(photobook ver.)</small>
                        <v-row class="justify-space-between" no-gutters>
                            <v-col>
                              <small class="text--disabled text-capitalize">x 1</small>
                            </v-col>
                            <v-col>
                              <small class="text--disabled text-capitalize">620 ฿</small>
                            </v-col>
                        </v-row>
                        <v-btn class="mt-2" x-small text>delete</v-btn>
                    </div>
                  </v-col>
              </v-row>
          </v-container>
        </div>
        <v-divider class="my-1"></v-divider>
          <v-container>
            <v-row class="justify-space-between">
              <v-col>
                <small class="text-capitalize">Total Price</small>
              </v-col>
              <v-col>
                <small class=" text-capitalize font-weight-bold deep-purple--text ml-16" >620 ฿</small>
              </v-col>
            </v-row>
            <v-btn class="cute2 my-3" color="#9293FF" dark rounded block to="/shop-cart">
              <v-icon class='mr-2' small>mdi-eye</v-icon>View all in cart
            </v-btn>
          </v-container>
      </v-list>
    </v-menu>
  </div>
</template>

// <script>
// export default {
//   data: () => ({
//     cartTotal: "",
//     carts: [],
//     totalPrice: 0,
//   }),
  
//   created() {
//     this.carts = this.$store.state.carts;
//   },

//   methods: {
//     deletecart(item) {
//       this.$store.commit("deletecart", item);
//     },
//   }

// }
</script>

<style scoped>
/* .pd-show{
    border-radius: 13px;
}
.cute2 {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2)), linear-gradient(90.72deg, #9293FF 16.46%, #FF90C9 100%);
} */
</style>