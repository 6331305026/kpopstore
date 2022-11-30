<template>
 <v-app id="payment">
    <navbar-store />
    <div class="bg-store">
      <v-container class="mt-16 pt-10">
        <h3 class="font-weight-regular text-uppercase mb-5">my order | payment
            <v-btn class="cute2 ml-2 px-6" color="#9293FF" dark rounded :to="{ name: 'store' }">
              <v-icon class="mr-2">mdi-arrow-left</v-icon>Back</v-btn>
        </h3>
        <v-layout wrap class="my-5 d-flex justify-center">
        <div class="product-p mt-6">
            <!-- <body-1>Your order product name is</body-1>
            <h3 class="font-weight-bold mb-3">{{ prd.product_name }}</h3>
            <body-1>Your order totalprice is</body-1>
            <h3 class="font-weight-bold mb-3">$ {{ prd.product_totalprice }}</h3>
            <v-col class="" cols="8">
              <v-img class="" height="100%" :src="prd.product_image"></v-img>
            </v-col> -->
        </div>
        <v-col cols="6">
            <v-card class="card-pay my-4" height="" width="600">
                <v-card-title class="justify-space-between">
                  Pay with card<v-img src="/Mastercard.png" max-height="55px" max-width="55px" class="mr-2"/>
                </v-card-title>
                <v-card-text class="card-text">Card Number
                    <v-text-field
                            v-model="CardNum"
                            outlined
                            rounded
                            placeholder="1234 5678 1234 5678"
                            hide-details
                            class="mt-2"
                            hint="Must have"
                            persistent-hint
                          ></v-text-field>
                </v-card-text>
                <v-card-text class="card-text">Name Card Holder
                    <v-text-field
                            v-model="CardName"
                            outlined
                            rounded
                            placeholder="John Doe"
                            hide-details
                            class="mt-2"
                            hint="Must have"
                            persistent-hint
                          ></v-text-field>
                </v-card-text>
                <v-row no-gutters class="pb-2">
                    <v-col col-3>
                    <v-card-text class="card-text">MM/YY
                    <v-text-field
                            v-model="MY"
                            outlined
                            rounded
                            placeholder="03/21"
                            hide-details
                            class="mt-2"
                            hint="Must have"
                            persistent-hint
                          ></v-text-field>
                </v-card-text>
                </v-col>
                <v-col col-3>
                <v-card-text class="card-text">CVV
                    <v-text-field
                            v-model="CVV"
                            outlined
                            rounded
                            placeholder="678"
                            hide-details
                            class="mt-2"
                            hint="Must have"
                            persistent-hint
                          ></v-text-field>
                </v-card-text>
                </v-col>
                </v-row>
            </v-card>
            <v-card-actions class="d-flex justify-end">
            <v-btn class="cute2 px-8" color="#9293FF" dark rounded @click.stop="dialog = true">
              <v-icon small class="mr-3">mdi-credit-card-outline</v-icon>Purchase
            </v-btn>
            </v-card-actions>
        </v-col>
        </v-layout>
      </v-container>
    </div>
      <v-dialog class="" v-model="dialog">
        <v-card class="pop-up">
          <v-card-title class="justify-center">
            <router-link to="/" class="d-flex align-center">
              <v-img
                src="/logo.png"
                max-height="150px"
                max-width="150px"
                alt="logo"
                contain
                class="me-3"
              ></v-img>
            </router-link>
          </v-card-title>
          <v-card-title class="title justify-center mb-4">
            <h1>Order Successful</h1>
          </v-card-title>
          <v-card-subtitle class="d-flex justify-center"><p>Order 1</p></v-card-subtitle>
          <!-- <v-card-subtitle class="d-flex justify-center"><p>Product #1</p></v-card-subtitle>
          <v-card-subtitle class="d-flex justify-center"><p>Price 790 ฿</p></v-card-subtitle> -->
          <v-card-actions>
            <v-btn
              class="cute mb-4"
              dark
              block
              rounded
              color="#9293FF"
              to="/"
              @click="dialog = false"
            >Back to home
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog>
 </v-app>
</template>

<script>
// const URL = "http://selab.mfu.ac.th:7426";
export default {
  data: () => ({
    dialog: false,
    prd: {},
  }),
  computed: {
    formTitle() {
      return this.editedIndex === -1 ? "New Product" : "Edit Product";
    },
  },

  watch: {
    dialog(val) {
      val || this.close();
    },
    dialogDelete(val) {
      val || this.closeDelete();
    },
  },

  created() {
    this.initialize();
  },

  methods: {
    async initialize() {
      console.log("initialize");
      console.log(this.$route.params.pid);
      const res = await this.$axios.get(
        URL + "/api/products/" + this.$route.params.pid
      );
      console.log(res);
      this.prd = res.data.data[0];
    },
    // addToCard(prd){
    //   return this.$store.state.card.push(product)
    // }
  },
};
</script>

<style>
.bg-store {
  height: 100%;
  width: 100%;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bg-shop.png");
}
.product-p h3 {
  color: #3c186f;
}
.pop-up {
  position: relative;
  width: 450px;
  left: 425px;
  /* opacity: 0.9; */
}
.cute {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(
    90.72deg,
    rgba(146, 147, 255, 0.85) 16.46%,
    rgba(255, 144, 201, 0.85) 100%
  );
}
.title h1 {
  font-size: 32px;
  color: #6c6c6c;
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}
.cute2 {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(0deg, rgba(255, 255, 255, 0.2), rgba(255, 255, 255, 0.2)), linear-gradient(90.72deg, #9293FF 16.46%, #FF90C9 100%);
}
.card-text {
  color: #4F4F4F;
  text-shadow: 0px 3px 4px rgba(0, 0, 0, 0.15);
}
.card-pay {
  position: relative;
  background-size: cover;
  background-image: url("/Card-MasterCard.png");
}
</style>


