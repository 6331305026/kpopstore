<template>
  <v-app id="login">
    <div class="bg-form">
      <v-card class="form-log justify-center">
        <!-- logo -->
        <v-card-title class="d-flex align-center justify-center py-7">
          <router-link to="/" class="d-flex align-center">
            <v-img
              src="/logo.svg"
              max-height="150px"
              max-width="150px"
              alt="logo"
              contain
              class="me-3"
            ></v-img>
          </router-link>
        </v-card-title>
        <!-- title -->
        <v-card-text class="align-center justify-center">
          <h2 class="text-2xl font-weight-semibold text--primary mb-2">
            Login
          </h2>
          <p class="mb-2">
            Please sign-in to your account and start the adventure
          </p>
        </v-card-text>
        <!-- login form -->
        <v-card-text>
          <v-form>
            <v-text-field
              v-model="email"
              outlined
              label="Email"
              placeholder="john@example.com"
              hide-details
              class="input mb-3"
              :rules="[rules.required]"
            ></v-text-field>
            <v-text-field
              class="input"
              v-model="password"
              outlined
              :type="isPasswordVisible ? 'text' : 'password'"
              label="Password"
              placeholder="············"
              :append-icon="isPasswordVisible ? 'mdi-eye' : 'mdi-eye-off'"
              :rules="[rules.required]"
              hide-details
              @click:append="isPasswordVisible = !isPasswordVisible"
            ></v-text-field>
            <div class="d-flex align-center justify-space-between flex-wrap">
              <v-checkbox label="Remember me" hide-details class="me-3 mt-1">
              </v-checkbox>
              <!-- forgot link -->
              <a href="javascript:void(0)" class="mt-1"> Forgot Password? </a>
            </div>
            <v-btn block color="#9293FF" dark class="cute mt-6" @click.stop="Login()"> Login Now </v-btn>
            <!-- <v-btn block color="#9293FF" dark class="cute mt-6" v-on:click="login()"> Login Now </v-btn> -->
          </v-form>
        </v-card-text>
        <!-- create new account  -->
        <v-card-text class="d-flex align-center justify-center flex-wrap">
          <span class="me-2"> Not have account? </span>
          <router-link to="/register"> Register Now </router-link>
        </v-card-text>
        <v-card-text class="d-flex align-center justify-center flex-wrap pb-8">
          <v-btn icon class="mr-3" to="">
            <v-img
              src="/facebook.png"
              max-height="50px"
              max-width="50px"
            ></v-img>
          </v-btn>
          <v-btn icon class="mr-3" to="">
            <v-img
              src="/instagram.png"
              max-height="50px"
              max-width="50px"
            ></v-img>
          </v-btn>
          <v-btn icon class="mr-3" to="">
            <v-img
              src="/twitter.png"
              max-height="50px"
              max-width="50px"
            ></v-img>
          </v-btn>
          <v-btn icon class="mr-3" to="">
            <v-img
              src="/pinterest.png"
              max-height="50px"
              max-width="50px"
            ></v-img>
          </v-btn>
        </v-card-text>
      </v-card>
      <!-- <v-dialog class="" v-model="dialog">
        <v-card class="pop-up">
          <v-card-title class="justify-center">
            <router-link to="/" class="d-flex align-center">
              <v-img
                src="/logo.png"
                max-height="50px"
                max-width="50px"
                alt="logo"
                contain
                class="me-3"
              ></v-img>
            </router-link>
          </v-card-title>

          <v-card-title class="title justify-center mb-4">
            <h1>Login Successful</h1>
          </v-card-title>

          <v-card-actions>
            <v-spacer></v-spacer>

            <v-btn
              class="cute mb-4"
              dark
              block
              rounded
              color="#9293FF"
              to="/"
              @click="dialog = false"
            >
              Back to home
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-dialog> -->
    </div>
  </v-app>
</template>

<style>
login {
  font-family: Roboto;
}
.bg-form {
  height: 100%;
  width: 100vw;
  position: relative;
  background-size: cover;
  background-position: 50% 50%;
  background-image: url("/bgkp2.png");
}
.form-log {
  align-items: center;
  width: 450px;
  position: relative;
  background-color: white;
  opacity: 0.8;
  margin-top: 70px;
  margin-left: 465px;
}
.pop-up {
  width: 450px;
  opacity: 0.9;
}
.title h1 {
  font-size: 32px;
  color: #6c6c6c;
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
}
.cute {
  text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  background: linear-gradient(
    90.72deg,
    rgba(146, 147, 255, 0.85) 16.46%,
    rgba(255, 144, 201, 0.85) 100%
  );
}
</style>

<script>
const URL = "http://selab.mfu.ac.th:7426";
export default {
  name: "Login",
  data() {
    return {
      email: "",
      password: "",
      dialog: false,
      isPasswordVisible: false,
      rules: {
        required: (value) => !!value || "Required.",
      },
    };
  },
  methods: {
    Login() {
      console.log(this.email+" "+this.password)
         this.$axios.post(URL + "/api/login", {
           email:this.email, 
           password:this.password
         })
          .then((response) => {
            
              this.$router.push({ path: "/" });    
          })
          .catch((err) => {
            alert("Email and password is incorrect");
            console.log(err.message)
          });
    }
  },
};
</script>
