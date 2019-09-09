require 'rspec'
require_relative '../lib/two_fer'

describe 'Two Fer' do
  it 'sample' do
    expect(TwoFer.new.say).to eq 'hello'
  end
end